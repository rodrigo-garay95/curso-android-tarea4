package com.saludo.tareaandroidsemana4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MascotaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MascotaFragment extends Fragment {

    private RecyclerView rvMascotas;
    ArrayList<Mascota> mascotas;
    public Adaptador adaptador;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MascotaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MascotaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MascotaFragment newInstance(String param1, String param2) {
        MascotaFragment fragment = new MascotaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_mascota, container, false);

        View v = inflater.inflate(R.layout.fragment_mascota, container, false);

        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        inicializarListaContactos();
        inicializarAdaptador();

        return v;

    }

    public void inicializarAdaptador(){

        Adaptador adaptador = new Adaptador(mascotas, getActivity());
        rvMascotas.setAdapter(adaptador);

    }

    public void inicializarListaContactos(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Bali", R.drawable.bali, 0));
        mascotas.add(new Mascota("Kodi", R.drawable.kodi, 0));
        mascotas.add(new Mascota("Sady", R.drawable.say, 0));
        mascotas.add(new Mascota("Lobi", R.drawable.lobi, 0));
        mascotas.add(new Mascota("Boss", R.drawable.boss, 0));

    }

}