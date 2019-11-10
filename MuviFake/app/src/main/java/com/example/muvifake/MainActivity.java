package com.example.muvifake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> stringArrayListNameFilms = new ArrayList<>();
    private ArrayList<String> stringArrayListRatingFilms = new ArrayList<>();
    private ArrayList<Integer> integerArrayListImageFilms = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitMaps();
    }

    private void initImageBitMaps(){
        integerArrayListImageFilms.add(R.drawable.joker_poster);
        stringArrayListNameFilms.add("Joker");
        stringArrayListRatingFilms.add("9.8");

        integerArrayListImageFilms.add(R.drawable.avatar_poster);
        stringArrayListNameFilms.add("Avatar");
        stringArrayListRatingFilms.add("8.7");

        integerArrayListImageFilms.add(R.drawable.guardians_of_the_galaxi_volumen_dos_poster);
        stringArrayListNameFilms.add("Guardians Of The Galaxy Vol.2");
        stringArrayListRatingFilms.add("7.3");

        integerArrayListImageFilms.add(R.drawable.rambo_poster);
        stringArrayListNameFilms.add("Rambo");
        stringArrayListRatingFilms.add("8.2");

        integerArrayListImageFilms.add(R.drawable.scream_4_poster);
        stringArrayListNameFilms.add("Scream 4");
        stringArrayListRatingFilms.add("4.6");

        integerArrayListImageFilms.add(R.drawable.star_wars_the_last_jedi_poster);
        stringArrayListNameFilms.add("Star Wars: The Last Jedi");
        stringArrayListRatingFilms.add("7.8");

        integerArrayListImageFilms.add(R.drawable.stranger_things_poster);
        stringArrayListNameFilms.add("Stranger Things");
        stringArrayListRatingFilms.add("9.4");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.MainActivity_RecyclerView_Films);
        RecyclerAdapter adapter = new RecyclerAdapter(stringArrayListNameFilms, stringArrayListRatingFilms, integerArrayListImageFilms,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
