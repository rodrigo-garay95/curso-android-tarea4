package com.saludo.tareaandroidsemana4.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.saludo.tareaandroidsemana4.R;
import com.saludo.tareaandroidsemana4.adapter.MascotaAdaptador;
import com.saludo.tareaandroidsemana4.pojo.Mascota;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private Toolbar miActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        miActionBar = (Toolbar) findViewById(R.id.miActionBarFavoritos);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Kodi", R.drawable.kodi, 4));
        mascotas.add(new Mascota("Lobi", R.drawable.lobi, 3));
        mascotas.add(new Mascota("Bali", R.drawable.bali, 2));
        mascotas.add(new Mascota("Say", R.drawable.say, 2));
        mascotas.add(new Mascota("Boss", R.drawable.boss, 1));

        RecyclerView rvMascotasFav = (RecyclerView) findViewById(R.id.rvMascotasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasFav.setLayoutManager(llm);

        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas, this);
        rvMascotasFav.setAdapter(mascotaAdaptador);

    }
}