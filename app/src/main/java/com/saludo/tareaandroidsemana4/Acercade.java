package com.saludo.tareaandroidsemana4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Acercade extends AppCompatActivity {

    private Toolbar miActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        miActionBar = (Toolbar) findViewById(R.id.miActionBarFavoritos);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}