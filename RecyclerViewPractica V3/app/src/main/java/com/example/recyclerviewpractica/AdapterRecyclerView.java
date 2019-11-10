package com.example.recyclerviewpractica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>{

    private static final String TAG = "AdapterRecyclerView";

    private ArrayList<String> stringArrayListNameImages = new ArrayList<>();
    private ArrayList<String> stringArrayListImages = new ArrayList<>();
    private Context context;

    public AdapterRecyclerView(ArrayList<String> stringArrayListNameImages, ArrayList<String> stringArrayListImages, Context context) {
        this.stringArrayListNameImages = stringArrayListNameImages;
        this.stringArrayListImages = stringArrayListImages;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_recyclerview,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .load(stringArrayListImages.get(position))
                .into(holder.imageViewImageCountry);

        holder.textViewNameCountry.setText(stringArrayListNameImages.get(position));

        holder.relativeLayoutParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, stringArrayListNameImages.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return stringArrayListNameImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewImageCountry;
        TextView textViewNameCountry;
        RelativeLayout relativeLayoutParentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewImageCountry = itemView.findViewById(R.id.CeldaRecyclerView_ImageView_CountryImage);
            textViewNameCountry = itemView.findViewById(R.id.CeldaRecyclerView_TextView_CountryName);
            relativeLayoutParentLayout = itemView.findViewById(R.id.CeldaRecyclerView_RelativeLayout_ParentLayout);
        }
    }
}
