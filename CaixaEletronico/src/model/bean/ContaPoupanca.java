/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Random;

/**
 *
 * @author douglas
 */
public class ContaPoupanca extends Banco {

    Random aleatorio = new Random();
    
     public ContaPoupanca() {
       setTipo("Conta Poupança");
    }

    public ContaPoupanca(Cliente dono) {
        super(dono);
        setTipo("Conta Poupança");
    }

//    @Override
//    public void abrirConta() {
//        if (isStatus() != true) {
//            setTipo("Conta Poupança");
//            int conta = aleatorio.nextInt(999999999) + 100000000;
//            setNumConta(conta);
//            System.out.println("Conta Poupança Aberta");
//            setStatus(true);
//        } else {
//            System.out.println("Conta já esta aberta");
//        }
//
//    }

}
