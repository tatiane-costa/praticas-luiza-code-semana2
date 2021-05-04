package com.company;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    // Cácula média das notas
    public double calculaMedia(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        return (nota1 + nota2) / 2;
    }
}