package com.example.projeto_padrao.models;
import android.content.Context;
import android.content.Intent;
public class Aplicação {

        public void trocarDeActivity(Context activityAtual, Class<?> activityDestino){

            Intent intent = new Intent(activityAtual, activityDestino);
            activityAtual.startActivity(intent);
        }

    }


