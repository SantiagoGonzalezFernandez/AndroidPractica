package com.example.volleyandglidetutorial.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.volleyandglidetutorial.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class AnimeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        // hide the default actionbar

        getSupportActionBar().hide();

        // Recieve data

        String name = getIntent().getExtras().getString("anime_name");
        String description = getIntent().getExtras().getString("anime_description");
        String studio = getIntent().getExtras().getString("anime_studio");
        String category = getIntent().getExtras().getString("anime_category");
        int nb_episode = getIntent().getExtras().getInt("anime_nb_episode");
        String rating = getIntent().getExtras().getString("anime_rating");
        String image_url = getIntent().getExtras().getString("anime_img");

        // ini views

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.AnimeActivity_CollapsingToolbarLayout);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView textViewName = findViewById(R.id.aa_AnimeRowItem_TextView_AnimeName);
        TextView textViewStudio = findViewById(R.id.aa_AnimeRowItem_TextView_AnimeStudio);
        TextView textViewCategorie = findViewById(R.id.aa_AnimeRowItem_TextView_AnimeCategory);
        TextView textViewDescription = findViewById(R.id.aa_description);
        TextView textViewRating = findViewById(R.id.aa_AnimeRowItem_TextView_AnimeRating);
        ImageView imageViewImageAnime = findViewById(R.id.aa_AnimeRowItem_ImageView_Thumbnail);

        // setting values to each view

        textViewName.setText(name);
        textViewStudio.setText(studio);
        textViewCategorie.setText(category);
        textViewDescription.setText(description);
        textViewRating.setText(rating);

        collapsingToolbarLayout.setTitle(name);

        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        //set image using Glide
        Glide.with(this).load(image_url).apply(requestOptions).into(imageViewImageAnime);
    }
}
