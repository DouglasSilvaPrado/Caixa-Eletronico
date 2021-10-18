/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Banco;

/**
 *
 * @author douglas
 */
public class BancoDAO {

    public void create(Banco b) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO conta (numero,tipo)VALUES(?,?)");
            stmt.setInt(1, b.getNumConta());
            stmt.setString(2, b.getTipo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public void updateSaldo(Banco b, int v){
        
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE conta SET saldo = saldo + ?  WHERE numero = ?");
            stmt.setInt(1, v);
            stmt.setInt(2, b.getNumConta());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Depositado com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Depositar: " + ex);
            Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void sacarSaldo(Banco b, int v){
        
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE conta SET saldo = saldo - ?  WHERE numero = ?");
            stmt.setInt(1, v);
            stmt.setInt(2, b.getNumConta());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Saque efetuado com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Sacar: " + ex);
            Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public double getSaldo(Banco b){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Banco banco = new Banco();
        try {
            
            stmt = con.prepareStatement("SELECT saldo FROM conta Where numero = ?;");
            stmt.setInt(1, b.getNumConta());
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                banco.setSaldo(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return banco.getSaldo();
        
    }
    
    

    public boolean checkConta(String tipo, int numero) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM conta WHERE tipo = ? and numero = ?");
            stmt.setString(1, tipo);
            stmt.setInt(2, numero);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }

}
