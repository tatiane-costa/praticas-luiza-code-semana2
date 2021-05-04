package com.company;

public class Main {

    public static void main(String[] args) {

        //Pessoal
        Conta conta = new Conta(1234,
                "Tatiane", 200, "Pessoal");
        conta.verInfo();

        //Corrente
        ContaCorrente contaCorrente = new ContaCorrente(56836,
                "Amanda", 300, "Conta Corrente");
        contaCorrente.verInfo();

        //Poupança
        Conta contaPoupanca = new ContaPoupanca(14652,
                "Camila", 400, "Conta Poupança");
        contaPoupanca.verInfo();

    }
}
