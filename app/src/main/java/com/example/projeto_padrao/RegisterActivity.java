package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity {
    EditText register_name;

    EditText register_email;
    EditText register_pass;
    CheckBox box_terms;
    Button btregistrar;
    Button btcancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.formulariuo_registro);
    register_name = (EditText) findViewById(R.id.register_name);

    register_email = (EditText) findViewById(R.id.register_email);
    register_pass = (EditText) findViewById(R.id.register_pass);
    box_terms = (CheckBox) findViewById(R.id.box_terms);
    btregistrar = (Button) findViewById(R.id.btregistrar);
    btcancel = (Button) findViewById(R.id.btcancel);


        btregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                Toast.makeText(RegisterActivity.this,"Registrado com Sucesso",Toast.LENGTH_SHORT).show();
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
