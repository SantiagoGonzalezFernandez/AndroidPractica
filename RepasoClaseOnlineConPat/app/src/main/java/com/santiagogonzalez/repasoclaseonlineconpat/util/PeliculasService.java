package com.santiagogonzalez.repasoclaseonlineconpat.util;

import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Detalle;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Pelicula;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.PeliculaContainer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PeliculasService {


    @GET("movie/popular")
    Call<PeliculaContainer> peliculasMasPopulares(@Query("api_key") String apiKey);

    @GET("movie/{movie_id}")
    Call<Detalle> getUnaPelicula(@Path("movie_id") String idPelicula,
                                 @Query("api_key") String apiKey);
}
