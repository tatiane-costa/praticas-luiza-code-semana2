package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Adiciona dados da aluna
        Aluno aluna = new Aluno("Tatiane");

        //Adiciona os dados da professora
        Professor professora = new Professor("Taína", "Java", aluna);
        System.out.printf("Professora: %s Curso %s\n", professora.getNome(), professora.getCurso());

        //Calcula salário do professor
        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();
        professora.salarioProfessor(horasTrabalhadas);

        //Mostra o salario do professor
        System.out.printf("A professora %s vai receber de salário R$ %.2f\n",
                professora.getNome(), professora.getsalario());

        //Calcula média
        System.out.println("Informe nota 1: ");
        double  nota1 = scan.nextDouble();
        System.out.println("informe nota 2: ");
        double nota2 = scan.nextDouble();

        double media = professora.getAluna().calculaMedia(nota1, nota2);
        // Verifica média para aprovação ou reprovação
        if (media >= 7){
            System.out.printf("A média da aluna %s é %.2f.\nAprovada!!! Parabens!!!", professora.getAluna().getNome(), media);
        }else{
            System.out.printf("A média da aluna %s é %.2f.\nReprovada!!!", professora.getAluna().getNome(), media);
        }
    }
}