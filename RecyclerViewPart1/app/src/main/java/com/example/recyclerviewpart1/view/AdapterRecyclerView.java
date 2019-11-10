package com.example.recyclerviewpart1.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpart1.R;
import com.example.recyclerviewpart1.model.Contact;

import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    Context mContext;
    List<Contact> mData;
    Dialog dialog;

    public AdapterRecyclerView(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_contact,parent,false);
        final ViewHolder viewHolder = new ViewHolder(view);

        //Dialog ini

        dialog = new Dialog(mContext);
        dialog.setContentView(R.layout.dialog_contact);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        viewHolder.linearLayoutContactItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView dialog_name_tv = dialog.findViewById(R.id.DialogContact_TextView_ContactName);
                TextView dialog_phone_tv = dialog.findViewById(R.id.DialogContact_TextView_PhoneNumberContact);
                ImageView dialog_contact_img = dialog.findViewById(R.id.DialogContact_ImageView_ImageContact);

                dialog_name_tv.setText(mData.get(viewHolder.getAdapterPosition()).getStringName());
                dialog_phone_tv.setText(mData.get(viewHolder.getAdapterPosition()).getStringPhone());
                dialog_contact_img.setImageResource(mData.get(viewHolder.getAdapterPosition()).getIntPhoto());

                Toast.makeText(mContext, "Test Click " + String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                dialog.show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textViewNameContact.setText(mData.get(position).getStringName());
        holder.textViewNumberPhoneContact.setText(mData.get(position).getStringPhone());
        holder.imageViewImageContact.setImageResource(mData.get(position).getIntPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout linearLayoutContactItem;
        private TextView textViewNameContact;
        private TextView textViewNumberPhoneContact;
        private ImageView imageViewImageContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayoutContactItem = itemView.findViewById(R.id.ItemContact_LinearLayout_ParentLayout);
            textViewNameContact = itemView.findViewById(R.id.ItemContact_TextView_ContactName);
            textViewNumberPhoneContact = itemView.findViewById(R.id.ItemContact_TextView_PhoneNumberContact);
            imageViewImageContact = itemView.findViewById(R.id.ItemContact_ImageView_ImageContact);
        }
    }
}
