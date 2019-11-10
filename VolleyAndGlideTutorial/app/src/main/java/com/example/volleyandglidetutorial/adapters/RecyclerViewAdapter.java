package com.example.volleyandglidetutorial.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.volleyandglidetutorial.R;
import com.example.volleyandglidetutorial.activities.AnimeActivity;
import com.example.volleyandglidetutorial.model.Anime;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;
    private List<Anime> mData;
    RequestOptions option;

    public RecyclerViewAdapter(Context mContext, List<Anime> mData) {
        this.mContext = mContext;
        this.mData = mData;

        // Request option for Glide
        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.anime_row_item,parent,false);
        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.linearLayoutViewContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, AnimeActivity.class);
                intent.putExtra("anime_name",mData.get(viewHolder.getAdapterPosition()).getName());
                intent.putExtra("anime_description",mData.get(viewHolder.getAdapterPosition()).getDescription());
                intent.putExtra("anime_studio",mData.get(viewHolder.getAdapterPosition()).getStudio());
                intent.putExtra("anime_category",mData.get(viewHolder.getAdapterPosition()).getCategorie());
                intent.putExtra("anime_nb_episode",mData.get(viewHolder.getAdapterPosition()).getNb_episode());
                intent.putExtra("anime_rating",mData.get(viewHolder.getAdapterPosition()).getRating());
                intent.putExtra("anime_img",mData.get(viewHolder.getAdapterPosition()).getImage_url());

                mContext.startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textViewAnimeName.setText(mData.get(position).getName());
        holder.textViewAnimeRating.setText(mData.get(position).getRating());
        holder.textViewAnimeStudio.setText(mData.get(position).getStudio());
        holder.textViewAnimeCategory.setText(mData.get(position).getCategorie());

        // Load Image from the internes and set in into ImageView using Glide

        Glide.with(mContext).load(mData.get(position).getImage_url()).apply(option).into(holder.imageViewAnimeThumbnail);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewAnimeName;
        TextView textViewAnimeRating;
        TextView textViewAnimeStudio;
        TextView textViewAnimeCategory;
        ImageView imageViewAnimeThumbnail;
        LinearLayout linearLayoutViewContainer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayoutViewContainer = itemView.findViewById(R.id.AnimeRowItem_LinearLayout_ParentLayout);
            textViewAnimeName = itemView.findViewById(R.id.AnimeRowItem_TextView_AnimeName);
            textViewAnimeCategory = itemView.findViewById(R.id.AnimeRowItem_TextView_AnimeCategory);
            textViewAnimeRating = itemView.findViewById(R.id.AnimeRowItem_TextView_AnimeRating);
            textViewAnimeStudio = itemView.findViewById(R.id.AnimeRowItem_TextView_AnimeStudio);
            imageViewAnimeThumbnail = itemView.findViewById(R.id.AnimeRowItem_ImageView_Thumbnail);
        }
    }
}
