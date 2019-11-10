package com.example.recyclerviewpracticav5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.NumerosViewHolder> {

    private int mNumeroItems;

    final private ListItemClick mOnClickListener;

    public RecyclerAdapter(int numeroDeItems, ListItemClick listener) {

        mNumeroItems = numeroDeItems;

        mOnClickListener = listener;
    }

    public interface ListItemClick{

        void onListItemClick(int clickedItem);
    }

    @NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context mContext = parent.getContext();
        int layoutIdParaListItem = R.layout.lista_numeros_row;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        boolean attachToParentRapido = false;

        View view = inflater.inflate(layoutIdParaListItem,parent,attachToParentRapido);

        NumerosViewHolder viewHolder = new NumerosViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {

        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumeroItems;
    }




    class NumerosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView mTvListaNumerosView;

        public NumerosViewHolder(@NonNull View itemView) {
            super(itemView);

            mTvListaNumerosView = itemView.findViewById(R.id.tv_lista_numeros);
            itemView.setOnClickListener(this);
        }

        void bind(int listaIndex) {

            mTvListaNumerosView.setText(String.valueOf(listaIndex));

        }

        @Override
        public void onClick(View view) {

            int clickedItem = getAdapterPosition();

            mOnClickListener.onListItemClick(clickedItem);
        }
    }
}
