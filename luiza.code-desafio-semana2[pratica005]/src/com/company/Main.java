package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa cliente1 = new Pessoa("Tatiane","963" ,"Rua Orlando");
        Pessoa cliente2 = new Pessoa("Amanda", "852", "Rua Japão");
        Pessoa cliente3 = new Pessoa("Camila", "741", "Rua Espanha");

        Conta conta1 = new Conta(25836, 600, "Tatiane");
        Conta conta2 = new Conta(25836, 800, "Amanda");
        Conta conta3 = new Conta(25836, 900, "Camila");

        // Adicionando as contas nos clientes
        cliente1.setConta(conta1);
        cliente2.setConta(conta2);
        cliente3.setConta(conta3);

        //Cliente1 saca dinhero
        boolean pessoa1PodeSacar = cliente1.getConta().sacar(60);
        if (pessoa1PodeSacar){
            System.out.println("Saque realizado com sucesso!!!");
        }else {
            System.out.println("Saldo infuciente!");
        }

        //Cliente2 saca dinhero e transfere para Cliente 3
        boolean pessoa2PodeSacar = cliente2.getConta().sacar(150);
        double valor = 150;

        if (pessoa2PodeSacar){
            System.out.println("Saque realizado com sucesso!!!");
            cliente3.getConta().transferir(valor);
        }else {
            System.out.println("Saldo infuciente!");
        }

        //Cliente3 saca dinhero
        boolean pessoa3PodeSacar = cliente3.getConta().sacar(80);
        if (pessoa3PodeSacar){
            System.out.println("Saque realizado com sucesso!!!");
        }else {
            System.out.println("Saldo infuciente!");
        }

        //Imprimindo nome + saldo disponivel dos clientes
        System.out.printf("A %s possui o saldo de R$ %.2f\n", cliente1.getNome(), cliente1.getConta().getSaldo());
        System.out.printf("A %s possui o saldo de R$ %.2f\n", cliente2.getNome(), cliente2.getConta().getSaldo());
        System.out.printf("A %s possui o saldo de R$ %.2f\n", cliente3.getNome(), cliente3.getConta().getSaldo());

    }
}


