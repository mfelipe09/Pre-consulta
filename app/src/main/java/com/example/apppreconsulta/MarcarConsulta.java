package com.example.apppreconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MarcarConsulta extends AppCompatActivity implements View.OnClickListener{

    Button btnMarcarUrgencia;
    Button btnMarcarMaternidade;
    Button btnMarcarClinica;
    Button btnMarcarDentista;
    Button btnMarcarCAPS;
    Button btnMarcarPsiquiatria;
    String CPF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcar_consulta);

      btnMarcarUrgencia = findViewById(R.id.btnMarcarUrgencia);
      btnMarcarMaternidade = findViewById(R.id.btnMarcarMaternidade);
      btnMarcarClinica = findViewById(R.id.btnMarcarClinica);
      btnMarcarDentista = findViewById(R.id.btnMarcarDentista);
      btnMarcarCAPS = findViewById(R.id.btnMarcarCAPS);
      btnMarcarPsiquiatria = findViewById(R.id.btnMarcarPsiquiatria);

      Intent intent = getIntent();
        CPF = intent.getStringExtra("usuario");


      btnMarcarUrgencia.setOnClickListener(this::localizacaourgencia);
      btnMarcarMaternidade.setOnClickListener(this::localizacaomaternidade);
      btnMarcarClinica.setOnClickListener(view -> localizacaoclinica());
      btnMarcarDentista.setOnClickListener(view -> localizacaodentista());
      btnMarcarCAPS.setOnClickListener(view -> localizacaoCAPS());
      btnMarcarPsiquiatria.setOnClickListener(view -> localizacaopsiquiatria());


    }

    private void localizacaopsiquiatria() {
        Intent intent = new Intent(this,Localizacao.class);
        intent.putExtra("string", "psiquiatria");
        intent.putExtra("usuario", CPF);
        startActivity(intent);
        finish();
    }

    private void localizacaoCAPS() {
        Intent intent = new Intent(this,Localizacao.class);
        intent.putExtra("string", "CAPS");
        intent.putExtra("usuario", CPF);
        startActivity(intent);
        finish();
    }

    private void localizacaodentista() {
        Intent intent = new Intent(this,Localizacao.class);
        intent.putExtra("string", "dentista");
        intent.putExtra("usuario", CPF);
        startActivity(intent);
        finish();
    }

    private void localizacaoclinica() {
        Intent intent = new Intent(this,Localizacao.class);
        intent.putExtra("string", "clinica");
        intent.putExtra("usuario", CPF);
        startActivity(intent);
        finish();
    }

    private void localizacaomaternidade(View view) {
        Intent intent = new Intent(this,Localizacao.class);
        intent.putExtra("string", "maternidade");
        intent.putExtra("usuario", CPF);
        startActivity(intent);
        finish();
    }

    public void localizacaourgencia(View v){
        Intent intent = new Intent(this, Localizacao.class);
        intent.putExtra("string", "urgencia");
        intent.putExtra("usuario", CPF);
        startActivity(intent);
        finish();
    }


    @Override
    public void onClick(View view) {

    }
}