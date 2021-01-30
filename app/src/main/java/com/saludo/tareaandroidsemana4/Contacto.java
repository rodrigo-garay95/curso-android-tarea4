package com.saludo.tareaandroidsemana4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class Contacto extends AppCompatActivity {

    private Toolbar miActionBar;
    private Button enviarComentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        miActionBar = (Toolbar) findViewById(R.id.miActionBarFavoritos);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        enviarComentario = (Button) findViewById(R.id.btnEnviarcomentario);

        enviarComentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Mensaje Enviado", Snackbar.LENGTH_LONG)
                        .setBackgroundTint(v.getResources().getColor(R.color.green_light))
                        .setTextColor(v.getResources().getColor(R.color.black))
                        .setActionTextColor(v.getResources().getColor(R.color.black))
                        .show();
            }
        });

    }

}