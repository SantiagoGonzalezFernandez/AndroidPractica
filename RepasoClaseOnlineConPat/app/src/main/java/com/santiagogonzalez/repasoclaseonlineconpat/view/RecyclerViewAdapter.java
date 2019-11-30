package com.santiagogonzalez.repasoclaseonlineconpat.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.santiagogonzalez.repasoclaseonlineconpat.R;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Pelicula;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PeliculasViewHolder> {

    public static final String IMAGEN_BASE_URL = "http://image.tmdb.org/t/p/original";
    private List<Pelicula> peliculaList;

    public RecyclerViewAdapter(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }

    public void actualizarLista(List<Pelicula> peliculaList){
        this.peliculaList = peliculaList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PeliculasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_pelicula,parent,false);
        PeliculasViewHolder myPeliculasViewHolder = new PeliculasViewHolder(view);
        return myPeliculasViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculasViewHolder holder, int position) {
        Pelicula pelicula = peliculaList.get(position);
        PeliculasViewHolder myPeliculasViewHolder = holder;
        myPeliculasViewHolder.bindPelicula(pelicula);
    }

    @Override
    public int getItemCount() {
        return peliculaList.size();
    }

    public class PeliculasViewHolder extends RecyclerView.ViewHolder {

        private ImageView myImageViewPosterPelicula;
        private TextView myTextViewTituloPelicula;
        private TextView myTextViewSinopsisPelicula;

        public PeliculasViewHolder(@NonNull View itemView) {
            super(itemView);
            myImageViewPosterPelicula = itemView.findViewById(R.id.CeldaPelicula_ImageView_ImagenPelicula);
            myTextViewSinopsisPelicula = itemView.findViewById(R.id.CeldaPelicula_TextView_SinopsisPelicula);
            myTextViewTituloPelicula = itemView.findViewById(R.id.CeldaPelicula_TextView_TituloPelicula);
        }

        public void bindPelicula(Pelicula pelicula){
            Glide.with(itemView).load( IMAGEN_BASE_URL + pelicula.getStringPosterPeliculaURL()).into(myImageViewPosterPelicula);
            myTextViewTituloPelicula.setText(pelicula.getStringTituloPelicula());
            myTextViewSinopsisPelicula.setText(pelicula.getStringSinopsisPelicula());
        }
    }
}
