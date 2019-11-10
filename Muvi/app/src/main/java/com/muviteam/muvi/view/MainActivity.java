package com.muviteam.muvi.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.muviteam.muvi.BuildConfig;
import com.muviteam.muvi.R;
import com.muviteam.muvi.model.Client;
import com.muviteam.muvi.model.Movie;
import com.muviteam.muvi.model.MoviesResponse;
import com.muviteam.muvi.model.Service;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public String stringTokenApi = "41c70e6b99d8ae34c17c9c34fd81e344";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadTopRated();
        loadUpcoming();
        loadPopular();
    }






    private void loadTopRated(){

        try{
            if (stringTokenApi.isEmpty()){
                Toast.makeText(getApplicationContext(), "Please obtain your API Key from themoviedb.org", Toast.LENGTH_SHORT).show();
                return;
            }
            Client Client = new Client();
            Service apiService = Client.getClient().create(Service.class);
            Call<MoviesResponse> call = apiService.getTopRatedMovies(stringTokenApi);
            call.enqueue(new Callback<MoviesResponse>() {
                @Override
                public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                    if (response.isSuccessful()){
                        if (response.body() != null){
                            List<Movie> movies = response.body().getResults();

                            MovieAdapter adapter = new MovieAdapter(getApplicationContext(), movies);
                            MultiSnapRecyclerView multiSnapRecyclerViewTopRatedListMovie =(MultiSnapRecyclerView) findViewById(R.id.MainActivity_MultiSnapRecyclerView_TopRatedListMovie);
                            LinearLayoutManager Manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
                            multiSnapRecyclerViewTopRatedListMovie.setLayoutManager(Manager);
                            multiSnapRecyclerViewTopRatedListMovie.setAdapter(adapter);

                        }
                    }
                }

                @Override
                public void onFailure(Call<MoviesResponse> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(getApplicationContext(), "Error fetching trailer data", Toast.LENGTH_SHORT).show();

                }
            });

        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    private void loadUpcoming(){

        try{
            if (stringTokenApi.isEmpty()){
                Toast.makeText(getApplicationContext(), "Please obtain your API Key from themoviedb.org", Toast.LENGTH_SHORT).show();
                return;
            }
            Client Client = new Client();
            Service apiService = Client.getClient().create(Service.class);
            Call<MoviesResponse> call = apiService.getUpcomingMovies(stringTokenApi);
            call.enqueue(new Callback<MoviesResponse>() {
                @Override
                public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                    if (response.isSuccessful()){
                        if (response.body() != null){
                            List<Movie> movies = response.body().getResults();

                            MovieAdapter adapter = new MovieAdapter(getApplicationContext(), movies);
                            MultiSnapRecyclerView multiSnapRecyclerViewTopRatedListMovie =(MultiSnapRecyclerView) findViewById(R.id.MainActivity_MultiSnapRecyclerView_UpcomingListMovie);
                            LinearLayoutManager Manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
                            multiSnapRecyclerViewTopRatedListMovie.setLayoutManager(Manager);
                            multiSnapRecyclerViewTopRatedListMovie.setAdapter(adapter);

                        }
                    }
                }

                @Override
                public void onFailure(Call<MoviesResponse> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(getApplicationContext(), "Error fetching trailer data", Toast.LENGTH_SHORT).show();

                }
            });

        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    private void loadPopular(){

        try{
            if (stringTokenApi.isEmpty()){
                Toast.makeText(getApplicationContext(), "Please obtain your API Key from themoviedb.org", Toast.LENGTH_SHORT).show();
                return;
            }
            Client Client = new Client();
            Service apiService = Client.getClient().create(Service.class);
            Call<MoviesResponse> call = apiService.getPopularMovies(stringTokenApi);
            call.enqueue(new Callback<MoviesResponse>() {
                @Override
                public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                    if (response.isSuccessful()){
                        if (response.body() != null){
                            List<Movie> movies = response.body().getResults();

                            MovieAdapter adapter = new MovieAdapter(getApplicationContext(), movies);
                            MultiSnapRecyclerView multiSnapRecyclerViewTopRatedListMovie =(MultiSnapRecyclerView) findViewById(R.id.MainActivity_MultiSnapRecyclerView_PopularListMovie);
                            LinearLayoutManager Manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
                            multiSnapRecyclerViewTopRatedListMovie.setLayoutManager(Manager);
                            multiSnapRecyclerViewTopRatedListMovie.setAdapter(adapter);

                        }
                    }
                }

                @Override
                public void onFailure(Call<MoviesResponse> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(getApplicationContext(), "Error fetching trailer data", Toast.LENGTH_SHORT).show();

                }
            });

        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
