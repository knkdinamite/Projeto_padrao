package com.example.projeto_padrao.models;

import android.content.Context;
import android.widget.Toast;


public class Usuario{
    private String username;
    private String password;

    private boolean logado;
    //private boolean registro;


    public Usuario(String usuario, String senha){
        this.username = usuario;
        this.password = senha;

    };
    public String getUsername(){return username;}

    public void setUsername(String username){this.username = username;}

    public String getPassword(){return password;}

    public void setPassword(String password){this.password = password;}

    public boolean getLogado(){return logado;}

    public void setLogado(boolean logado){this.logado = logado;}

    public void logar(Context context){

        Android android = new Android(context);
        if (android.getConected(context)){
            this.logado = true;
            Toast.makeText(context,"Usuario esta logado",Toast.LENGTH_LONG).show();
        }else{
            this.logado = false;
            Toast.makeText(context,"Usuario não esta logado",Toast.LENGTH_LONG).show();

        }

    }

    public void registrar(){

    }
}


