package test;


import model.bean.ContaPoupanca;
import model.bean.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author douglas
 */
public class testBanco {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Douglas", "123");
        ContaPoupanca cp1 = new ContaPoupanca(cliente1);

        cp1.abrirConta();
        cp1.detalhes();

    }
}
