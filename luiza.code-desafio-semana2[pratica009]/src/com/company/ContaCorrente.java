package com.company;

public class ContaCorrente extends Conta {
    private double chequeEspecial = 100;

    public ContaCorrente(int numero, String dono, double saldo, String tipoDeconta) {
        super(numero, dono, saldo, tipoDeconta);
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void verInfo() {
        super.verInfo();
        System.out.println("Cheque especial disponível: R$ " + chequeEspecial);

    }
}

