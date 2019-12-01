package com.santiagogonzalez.repasoclaseonlineconpat.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.santiagogonzalez.repasoclaseonlineconpat.R;
import com.santiagogonzalez.repasoclaseonlineconpat.model.pojo.Pelicula;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PeliculasViewHolder> {

    public static final String IMAGEN_BASE_URL = "http://image.tmdb.org/t/p/original";
    private List<Pelicula> peliculaList;
    private EscuchadorCelda escuchadorCelda;

    public RecyclerViewAdapter(List<Pelicula> peliculaList, EscuchadorCelda escuchadorCelda) {
        this.peliculaList = peliculaList;
        this.escuchadorCelda = escuchadorCelda;
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

        public PeliculasViewHolder(@NonNull final View itemView) {
            super(itemView);
            myImageViewPosterPelicula = itemView.findViewById(R.id.CeldaPelicula_ImageView_ImagenPelicula);
            myTextViewSinopsisPelicula = itemView.findViewById(R.id.CeldaPelicula_TextView_SinopsisPelicula);
            myTextViewTituloPelicula = itemView.findViewById(R.id.CeldaPelicula_TextView_TituloPelicula);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pelicula pelicula  = peliculaList.get(getAdapterPosition());
                    escuchadorCelda.eligieronUnaCelda(pelicula);
                }
            });
        }

        public void bindPelicula(Pelicula pelicula){
            Glide.with(itemView).load( IMAGEN_BASE_URL + pelicula.getStringPosterPeliculaURL()).into(myImageViewPosterPelicula);
            myTextViewTituloPelicula.setText(pelicula.getStringTituloPelicula());
            myTextViewSinopsisPelicula.setText(pelicula.getStringSinopsisPelicula());
        }
    }

    public interface EscuchadorCelda{
        public void eligieronUnaCelda(Pelicula pelicula);
    }
}
