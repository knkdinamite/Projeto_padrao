package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PerfilActivity extends AppCompatActivity {
    Button btexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);
        btexit = (Button) findViewById(R.id.btexit);

        btexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfilActivity.this, LoginActivity.class);
                Toast.makeText(PerfilActivity.this,"Saiu com Sucesso",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}