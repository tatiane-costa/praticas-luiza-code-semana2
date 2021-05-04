package com.company;

public class Conta {
    private int numero;
    private double saldo;
    private String dona;

    public Conta(int numero, double saldo, String dona) {
        this.numero = numero;
        this.saldo = saldo;
        this.dona = dona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDona() {
        return dona;
    }

    public void setDona(String dona) {
        this.dona = dona;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0)
        {
            this.saldo = saldo;
        }
    }

    public boolean sacar(int valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor){
        // Não aceita valor negativo
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
}