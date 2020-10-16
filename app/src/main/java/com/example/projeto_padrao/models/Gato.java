package com.example.projeto_padrao.models;

import java.util.Date;

public class Gato {
    private int idade;
    private int dataNasc;
    private String nome;
    private boolean miando;


    public String getNome(){return this.nome;}

    public void setNome(String nome){this.nome = nome;}

    public int getIdade(){return this.idade;}

    public void setIdade(int idade){this.idade = idade;}

    public int getDataNasc(){return this.dataNasc;}

    public void setDataNasc(int dataNasc){this.dataNasc = dataNasc;}

    public void miar( ){
        this.miando = true;

    }

    public void calcularIdade(){
        this.idade = idade;
    }

}
