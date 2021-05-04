package com.company;

public class Conta {
    private  int numero;
    private String dono;
    private double saldo;

    private String tipoDeconta;

    public Conta(){}

    public Conta(int numero, String dono, double saldo, String tipoDeconta) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.tipoDeconta = tipoDeconta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        // impede adição de saldo negativo
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    //Sacar
    public boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    //Transferir
    public void transferir(double valor){
        saldo += valor;
    }

    //Ver  informações
    public void verInfo(){
        System.out.println("--------INFORMAÇÃO DA CONTA--------");
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Tipo de Conta: " + this.tipoDeconta);
    }
}