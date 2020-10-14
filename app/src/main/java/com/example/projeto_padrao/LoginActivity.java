package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user_login ;
    EditText senha_login;
    Button btlogin;
    Button btregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Log.d("Ciclo_vivido", "onCreate - a novaActivity iniciou");

        user_login = (EditText) findViewById(R.id.user_login);
        senha_login = (EditText) findViewById(R.id.senha_login);
        btlogin = (Button) findViewById(R.id.btlogin);
        btregister = (Button) findViewById(R.id.btregister);

        btregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = user_login.getText().toString();
                String senha = senha_login.getText().toString();

                Log.d("autenticação","\nUsuario:"+ usuario + "\nSenha:"+ senha);

                Usuario usuarioLogado = new Usuario(usuario,senha);
                usuarioLogado.logar(LoginActivity.this);

                Intent intent = new Intent(LoginActivity.this,PerfilActivity.class);
                Toast.makeText(LoginActivity.this,"Logado com Sucesso",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart(){

        Log.d( "Ciclo_vivido", "onStart-Comecando");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Log.d("Ciclo_vivido","onResume - Estado de interaçao com a tela");
        super.onResume();
    }
    @Override
    protected  void onPause(){
        Log.d( "Ciclo_vivido", "onPause - iniciou o termino da actuvity");
        super.onPause();
    }
    @Override
    protected  void onStop(){
        Log.d( "Ciclo_vivido", "onStop - fechou a aplicaçao(sem atividade visivel)");
        super.onStop();
    }
    @Override
    protected  void onDestroy(){
        Log.d( "Ciclo_vivido", "onDestroy - activity completamente destruida");
        super.onDestroy();
    }

}
