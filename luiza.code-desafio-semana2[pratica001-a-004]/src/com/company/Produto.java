package com.company;

public class Produto {

        //Agora, continuando o exercício anterior, adicione as seguintes
        //classes no resultado da Prática anterior.

        //Pessoa [nome: String| endereco: String| numero: String] + consultaEndereco(): Endereco; + consultaNome(): String
        //Endereco [logradouro: String| cidade: String| estado: String] + consultaLogradouro(): String
        //Produto [codigo:long| nome:String] + consultaNome(): String
        //Compra [pessoa: Pessoa| produto: Produto] + comprar(pessoa: Pessoa, produto: Produto): void;
        //+ verificarCompra():String

        //Perceba que a classe Compra vai conter um objeto do tipo Pessoa e outro do
        //tipo Produto.
        //Será possível comprar usando o método comprar, passando com o
        //parâmetro dois objetos, um do tipo Pessoa e outro do tipo Produto.

    private long codigo;
    private String nome;

    public Produto(){}

    public Produto(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String consultaNome(){
        return getNome();
    }
}

