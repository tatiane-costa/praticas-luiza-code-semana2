package com.company;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String dono, double saldo, String tipoDeconta) {
        super(numero, dono, saldo, tipoDeconta);
    }

    public void verInfo(){
        super.verInfo();
    }
}
