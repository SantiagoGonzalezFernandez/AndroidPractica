package com.example.recyclerviewpluscardview.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpluscardview.R;
import com.example.recyclerviewpluscardview.model.Book;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Book> mData;

    public RecyclerViewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.textViewBookTitle.setText(mData.get(position).getStringTitle());
        holder.imageViewBookThumbnail.setImageResource(mData.get(position).getIntThumbnail());
        holder.cardViewParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, BookActivity.class);

                // Passing data to the book activity
                intent.putExtra("Title", mData.get(position).getStringTitle());
                intent.putExtra("Description", mData.get(position).getStringDescription());
                intent.putExtra("Thumbnail", mData.get(position).getIntThumbnail());
                //Start Activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewBookTitle;
        ImageView imageViewBookThumbnail;
        CardView cardViewParent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewBookTitle = itemView.findViewById(R.id.CardViewItemBook_TextView_BookTitle);
            imageViewBookThumbnail = itemView.findViewById(R.id.CardViewItemBook_ImageView_BookImage);
            cardViewParent = itemView.findViewById(R.id.CardViewItemBook_CardView_ParentLayout);
        }
    }
}
