package br.com.pocomartins.tupicionario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvBichos = (TextView) findViewById(R.id.tvbichos);
        tvBichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BichosActivity.class);
                startActivity(i);
            }
        });

        TextView tvCulinaria = (TextView) findViewById(R.id.tvculinaria);
        tvCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CulinariaActivity.class);
                startActivity(i);
            }
        });

        TextView tvPlantas = (TextView) findViewById(R.id.tvplantas);
        tvPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlantasActivity.class);
                startActivity(i);
            }
        });

        TextView tvPovos = (TextView) findViewById(R.id.tvpovos);
        tvPovos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PovosNativosActivity.class);
                startActivity(i);
            }
        });

    }
}
