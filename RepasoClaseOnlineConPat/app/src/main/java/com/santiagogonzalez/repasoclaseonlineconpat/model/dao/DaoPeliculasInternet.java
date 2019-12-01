package com.santiagogonzalez.repasoclaseonlineconpat.model.dao;

import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Detalle;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Pelicula;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.PeliculaContainer;
import com.santiagogonzalez.repasoclaseonlineconpat.util.PeliculasService;
import com.santiagogonzalez.repasoclaseonlineconpat.util.ResultListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DaoPeliculasInternet {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String API_KEY = "35e3a62b4d3f69da7d3a732867d3e414";
    private Retrofit retrofit;
    private PeliculasService peliculasService;

    public DaoPeliculasInternet(){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        peliculasService = retrofit.create(PeliculasService.class);
    }

    public void traerPeliculasDeInternet(final ResultListener<PeliculaContainer> escuchadorDelController){

        Call<PeliculaContainer> masPopularesCall = peliculasService.peliculasMasPopulares(API_KEY);

        masPopularesCall.enqueue(new Callback<PeliculaContainer>() {
            @Override
            public void onResponse(Call<PeliculaContainer> call, Response<PeliculaContainer> response) {
                PeliculaContainer body = response.body();
                escuchadorDelController.finish(body);
            }

            @Override
            public void onFailure(Call<PeliculaContainer> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void traerUnaPeliculaPorId(final ResultListener<Detalle> escuchadorDelController, String idDeLaPelicula){
        Call<Detalle> detalleCall = peliculasService.getUnaPelicula(idDeLaPelicula, API_KEY);
        detalleCall.enqueue(new Callback<Detalle>() {
            @Override
            public void onResponse(Call<Detalle> call, Response<Detalle> response) {
                Detalle body = response.body();
                escuchadorDelController.finish(body);
            }

            @Override
            public void onFailure(Call<Detalle> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
