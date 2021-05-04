package com.company;

public class Compra {

        //Utilizando o algoritmo implementado na prática 03, agora
         //desenvolva a classe Main:
        //● Inicialmente, a classe deve criar 2 objetos do tipo Produto (crie os
        //objetos com as informações que desejar)
        //● O usuário faz um cadastro (criando um objeto do tipo Pessoa)
        //● Logo após, o usuário seleciona entre os 2 produtos cadastrados
        //anteriormente
        //● Dependendo da escolha, é acessado o método comprar da classe
        //Compra, e passado como parâmetro o objeto Pessoa que ele cadastrou
        //e o do Produto escolhido
        //● Logo após, é exibido no console ao usuário uma mensagem de
        //confirmação, exibindo o nome dele e do produto comprado (acesso ao
        //método verificarCompra()) e finaliza a aplicação

    Pessoa pessoa;
    Produto produto;

    public Compra(){}

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public String verificarCompra(){
        return "Pessoa: " + getPessoa().getNome() + "\n Produto: " + getProduto().getNome();
    }
}

