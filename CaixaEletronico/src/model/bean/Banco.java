/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class Banco {

    private int numConta;
    private String senha;
    private Cliente dono;
    private String tipo;
    private double saldo;
    private boolean status;
    
    public Banco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public Banco(Cliente dono) {
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    

    public void depositar(int valor) {
        setSaldo(getSaldo() + valor);
     
    }

    public void sacar(int valor) {
         if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Saque efetuado!");
        } else if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo Insulficiente!");
        }   
    }
    
    public void abrirConta() {
        Random aleatorio = new Random();
        if (isStatus() != true) {
            int conta = aleatorio.nextInt(999999999) + 100000000;
            setNumConta(conta);
            System.out.println("Conta Aberta");
            setStatus(true);
        } else {
            System.out.println("Conta já esta aberta");
        }
    }
    
    public void fecharConta() {
        if (isStatus() == false) {
            System.out.println("Você não tem conta para fechar!");
        } else if (getSaldo() == 0) {
            setStatus(false);
            System.out.println("Conta Fechada!");
        } else {
            System.out.println("Verifique seu saldo para fecha a conta!");
        }
    }

    public void detalhes() {
        System.out.printf("Dono: %s\n", getDono().getNome());
        System.out.printf("Tipo Conta: %s\n", getTipo());
        System.out.printf("Numero Conta: %d\n", getNumConta());
        System.out.printf("Saldo: %.2f\n", getSaldo());
        System.out.printf("Status: %b\n", isStatus());
    }

    
    
    

    //Metodos Especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
