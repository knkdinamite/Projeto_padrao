package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.projeto_padrao.models.Usuario;

public class RegisterActivity extends AppCompatActivity {
    EditText register_name;
    EditText register_user;
    EditText register_email;
    EditText register_pass;
    CheckBox box_terms;
    Button btregistrar;
    Button btcancel;

    private void identificandoComponentes() {
        register_name = (EditText) findViewById(R.id.register_user);
        register_user = (EditText) findViewById(R.id.register_user);
        register_email = (EditText) findViewById(R.id.register_email);
        register_pass = (EditText) findViewById(R.id.register_pass);
        box_terms = (CheckBox) findViewById(R.id.box_terms);
        btregistrar = (Button) findViewById(R.id.btregistrar);
        btcancel = (Button) findViewById(R.id.btcancel);
    }
    private void inicializandoComponentes() {
        //----------------------------- BOTÃO DE REGISTRO--------------------------------//

        btregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = register_user.getText().toString();
                String senha = register_pass.getText().toString();

                Usuario usuarioLogado = new Usuario(usuario,senha);
                usuarioLogado.registrar(RegisterActivity.this);
            }
        });


        //----------------------------- BOTÃO DE TRANSIÇÃO PARA O REGISTRO--------------------------------//
        btregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.formulariuo_registro);



        identificandoComponentes();
        inicializandoComponentes();


        btcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
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
