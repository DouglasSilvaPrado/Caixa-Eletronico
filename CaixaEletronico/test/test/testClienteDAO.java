/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import model.bean.Cliente;
import model.dao.ClienteDAO;


/**
 *
 * @author douglas
 */
public class testClienteDAO {
    public static void main(String[] args) {
        Cliente c1  = new Cliente();
        ClienteDAO cDAO = new ClienteDAO();
        c1.setNome("Jone");
        c1.setSenha("222");
        
        cDAO.updateCliente(c1);
    }
    
}
