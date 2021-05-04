package com.company;

public class Endereco {

        //Desenvolva o seguinte relacionamento
        //Pessoa [nome: String| endereco: String| numero: String] + consultaEndereco(): Endereco; + consultaNome(): String
        //Endereco [logradouro: String| cidade: String| estado: String] + consultaLogradouro(): String
        //Perceba que a classe Pessoa vai ter um objeto do tipo Endereço.
        //Lembre-se de criar os construtores parametrizados.

    private String logradouro;
    private String cidade;
    private String estado;

    public Endereco(){}

    public Endereco(String logradouro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String consultaLogradouro(){
        return getLogradouro();
    }
}

