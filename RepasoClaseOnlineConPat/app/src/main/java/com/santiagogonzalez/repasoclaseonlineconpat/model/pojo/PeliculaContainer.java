package com.santiagogonzalez.repasoclaseonlineconpat.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeliculaContainer {

    @SerializedName("results")
    private List<Pelicula> peliculaList;

    public PeliculaContainer(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }

    public PeliculaContainer() {
    }

    public List<Pelicula> getPeliculaList() {
        return peliculaList;
    }

    public void setPeliculaList(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }
}
