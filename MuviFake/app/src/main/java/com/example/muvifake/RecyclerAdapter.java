package com.example.muvifake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.FilmsViewHolder>{

    private ArrayList<String> stringArrayListNameFilms;
    private ArrayList<String> stringArrayListRatingFilms;
    private ArrayList<Integer> integerArrayListImageFilms;
    private Context mContext;

    public RecyclerAdapter(ArrayList<String> stringArrayListNameFilms, ArrayList<String> stringArrayListRatingFilms, ArrayList<Integer> integerArrayListImageFilms, Context mContext) {
        this.stringArrayListNameFilms = stringArrayListNameFilms;
        this.stringArrayListRatingFilms = stringArrayListRatingFilms;
        this.integerArrayListImageFilms = integerArrayListImageFilms;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public FilmsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_films_row,parent,false);

        FilmsViewHolder filmsViewHolder = new FilmsViewHolder(view);

        return filmsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsViewHolder holder, int position) {

        holder.myImageViewImageFilm.setImageResource(integerArrayListImageFilms.get(position));
        holder.myTextViewNameFilm.setText(stringArrayListNameFilms.get(position));
        holder.myTextViewRatingFilm.setText(stringArrayListRatingFilms.get(position));
    }

    @Override
    public int getItemCount() {
        return stringArrayListNameFilms.size();
    }

    class FilmsViewHolder extends RecyclerView.ViewHolder{

        ImageView myImageViewImageFilm;
        TextView myTextViewNameFilm;
        TextView myTextViewRatingFilm;

        public FilmsViewHolder(@NonNull View itemView) {
            super(itemView);

            myImageViewImageFilm = itemView.findViewById(R.id.listFilmsRow_ImageView_ImageFilm);
            myTextViewNameFilm = itemView.findViewById(R.id.listFilmsRow_TextView_NameFilm);
            myTextViewRatingFilm = itemView.findViewById(R.id.listFilmsRow_TextView_RatingFilm);

        }
    }
}
