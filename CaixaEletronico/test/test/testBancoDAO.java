/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.bean.Banco;
import model.bean.Cliente;
import model.bean.ContaCorrente;
import model.dao.BancoDAO;

/**
 *
 * @author douglas
 */
public class testBancoDAO {
    public static void main(String[] args) {
        BancoDAO bDAO = new BancoDAO();
        Banco b = new Banco();
        b.setNumConta(123456789);
        b.setTipo("Conta Corrente");
//        System.out.printf("Numero Conta: %d\n", b.getNumConta());
        //bDAO.updateSaldo(b, 400);
        System.out.println(bDAO.getSaldo(b));

    }
}
