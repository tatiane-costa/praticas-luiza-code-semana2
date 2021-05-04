package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner scan = new Scanner(System.in);

        //Criar dois objetos do tipo produto:
        Produto produto1 = new Produto(123434, "(1) - TV");
        Produto produto2 = new Produto(432344, "(2) - Celular");

        //Inicialmente, a classe deve criar 2 objetos do tipo Produto (crie os
        //objetos com as informações que desejar)
        Pessoa user = new Pessoa();
        Endereco end = new Endereco();
        end.setLogradouro("Rua Antônio Ribeiro");
        end.setCidade("Franca");
        end.setEstado("SP");

        //Logo após, o usuário seleciona entre os 2 produtos cadastrados anteriormente
        //● Dependendo da escolha, é acessado o método comprar da classe
        //Compra, e passado como parâmetro o objeto Pessoa que ele cadastrou
        //e o do Produto escolhido
        user.setNome("Tatiane");
        user.setEndereco(end);
        user.setNumero("007");

        Compra compra = new Compra();

        //Logo após, é exibido no console ao usuário uma mensagem de
        //confirmação, exibindo o nome dele e do produto comprado (acesso ao
        //método verificarCompra()) e finaliza a aplicação
        System.out.println("Escolha um produto: \n" + produto1.getNome() +"\n" + produto2.getNome() +"\n");

        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                compra.comprar(user, produto1);
                break;
            case 2:
                compra.comprar(user, produto2);
                break;
            default:
                System.out.println("Produto indisponível.");
        }

        System.out.println(compra.verificarCompra());

        // Teste do método consultar endereço
        System.out.println(user.consultaEndereco(end));

    }
}

