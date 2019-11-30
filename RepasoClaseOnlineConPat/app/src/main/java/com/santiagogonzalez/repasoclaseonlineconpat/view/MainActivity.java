package com.santiagogonzalez.repasoclaseonlineconpat.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.santiagogonzalez.repasoclaseonlineconpat.R;
import com.santiagogonzalez.repasoclaseonlineconpat.controller.PeliculaController;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Pelicula;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.PeliculaContainer;
import com.santiagogonzalez.repasoclaseonlineconpat.util.ResultListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecyclerViewListaPeliculas;
    private List<Pelicula> peliculas;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarComponentesPorId();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        myRecyclerViewListaPeliculas.setLayoutManager(linearLayoutManager);

        peliculas = new ArrayList<>();


        final PeliculaController peliculaController = new PeliculaController();
        peliculaController.traerPeliculasDeInternet(new ResultListener<PeliculaContainer>() {
            @Override
            public void finish(PeliculaContainer results) {
                peliculas = results.getPeliculaList();
                recyclerViewAdapter.actualizarLista(peliculas);
            }
        });


        recyclerViewAdapter  = new RecyclerViewAdapter(peliculas);
        myRecyclerViewListaPeliculas.setAdapter(recyclerViewAdapter);
        myRecyclerViewListaPeliculas.setHasFixedSize(true);

    }

    private void encontrarComponentesPorId(){
        myRecyclerViewListaPeliculas = findViewById(R.id.MainActivity_RecyclerView_ListaPeliculas);
    }
}
