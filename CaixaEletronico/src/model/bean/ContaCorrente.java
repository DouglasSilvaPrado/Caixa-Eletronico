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
public class ContaCorrente extends Banco {

    Random aleatorio = new Random();
    
    public ContaCorrente(){
        setTipo("Conta Corrente");
    }
    
    public ContaCorrente(Cliente dono) {
        super(dono);
        setTipo("Conta Corrente");
    }


//    @Override
//    public void abrirConta() {
//        if (isStatus() != true) {
//            setTipo("Conta Corrente");
//            int conta = aleatorio.nextInt(999999999) + 100000000;
//            setNumConta(conta);
//            System.out.println("Conta Corrente Aberta");
//            setStatus(true);
//        } else {
//            System.out.println("Conta já esta aberta");
//        }
//    }

}
