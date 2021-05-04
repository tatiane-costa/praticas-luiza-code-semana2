package com.company;

public class Professor {
    private String nome;
    private String curso;
    private double salario;
    private Aluno aluna;

    //Valor da aula
    private double valorAula = 29.00;

    public Professor(String nome, String curso, Aluno aluna) {
        this.nome = nome;
        this.curso = curso;
        this.aluna = aluna;
    }

    public Aluno getAluna() { return aluna; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public double getsalario() { return salario; }

    //Calcula salário do professor
    public void salarioProfessor(double valorHora) {
        this.salario = valorHora * valorAula;
    }
}