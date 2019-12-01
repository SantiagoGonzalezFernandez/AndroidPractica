package com.santiagogonzalez.repasoclaseonlineconpat.model.pojo;

import com.google.gson.annotations.SerializedName;

public class Pelicula {

    @SerializedName("poster_path")
    private String stringPosterPeliculaURL;
    @SerializedName("title")
    private String stringTituloPelicula;
    @SerializedName("overview")
    private String stringSinopsisPelicula;
    private String id;

    public Pelicula(String stringPosterPeliculaURL, String stringTituloPelicula, String stringSinopsisPelicula, String id) {
        this.stringPosterPeliculaURL = stringPosterPeliculaURL;
        this.stringTituloPelicula = stringTituloPelicula;
        this.stringSinopsisPelicula = stringSinopsisPelicula;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pelicula() {
    }

    public String getStringPosterPeliculaURL() {
        return stringPosterPeliculaURL;
    }

    public void setStringPosterPeliculaURL(String stringPosterPeliculaURL) {
        this.stringPosterPeliculaURL = stringPosterPeliculaURL;
    }

    public String getStringTituloPelicula() {
        return stringTituloPelicula;
    }

    public void setStringTituloPelicula(String stringTituloPelicula) {
        this.stringTituloPelicula = stringTituloPelicula;
    }

    public String getStringSinopsisPelicula() {
        return stringSinopsisPelicula;
    }

    public void setStringSinopsisPelicula(String stringSinopsisPelicula) {
        this.stringSinopsisPelicula = stringSinopsisPelicula;
    }


}
