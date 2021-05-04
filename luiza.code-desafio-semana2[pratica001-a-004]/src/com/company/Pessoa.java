package com.company;

import java.util.ArrayList;
import java.util.List;
public class Pessoa {

        //- Crie uma classe para pessoa com as seguintes características:
        //● Atributos:
        //○ Nome, idade, CNH
        //● Metodos:
        //○ Dirigir, dormir, comer

        private String nome;
        private Endereco endereco;
        private String numero;

        public Pessoa(){}

        public Pessoa(String nome, Endereco endereco, String numero) {
            this.nome = nome;
            this.endereco = endereco;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public Endereco consultaEndereco(Endereco endereco){
            List<Object> l = new ArrayList<>();
            l.add(getEndereco());
            Endereco o = null;
            if (l.equals(endereco)) {
                o = endereco;
            }
            return o;
        }

        public  String consultaNome(){
            return getNome();
        }

}
