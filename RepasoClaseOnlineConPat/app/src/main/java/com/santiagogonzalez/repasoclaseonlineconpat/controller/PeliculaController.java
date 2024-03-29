package com.santiagogonzalez.repasoclaseonlineconpat.controller;

import com.santiagogonzalez.repasoclaseonlineconpat.model.dao.DaoPeliculasInternet;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Detalle;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Pelicula;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.PeliculaContainer;
import com.santiagogonzalez.repasoclaseonlineconpat.util.ResultListener;

public class PeliculaController {

    private DaoPeliculasInternet dao;

    public PeliculaController() {
        dao = new DaoPeliculasInternet();
    }

    public void traerPeliculasDeInternet(final ResultListener<PeliculaContainer> escuchadorDeLaVista){
        dao.traerPeliculasDeInternet(new ResultListener<PeliculaContainer>() {
            @Override
            public void finish(PeliculaContainer results) {
                escuchadorDeLaVista.finish(results);
            }
        });
    }

    public void traerUnaPeliculaPorId(final ResultListener<Detalle> escuchadorDeLaVista, String idDeLaPelicula){
        dao.traerUnaPeliculaPorId(new ResultListener<Detalle>() {
            @Override
            public void finish(Detalle results) {
                escuchadorDeLaVista.finish(results);
            }
        },idDeLaPelicula);
    }
}
