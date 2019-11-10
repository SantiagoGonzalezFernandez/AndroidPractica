package com.example.recyclerviewpluscardview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewpluscardview.R;

public class BookActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private TextView textViewDescription;
    private TextView textViewCategory;
    private ImageView imageViewImageBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        textViewTitle = findViewById(R.id.BookActivity_TextView_Title);
        textViewDescription = findViewById(R.id.BookActivity_TextView_Description);
        textViewCategory = findViewById(R.id.BookActivity_TextView_Category);
        imageViewImageBook = findViewById(R.id.BookActivity_ImageView_ImageBook);

        // Recieve data

        Intent intent = getIntent();
        String stringTilte = intent.getExtras().getString("Title");
        String stringDescription = intent.getExtras().getString("Description");
        int intImage = intent.getExtras().getInt("Thumbnail");

        // Setting values

        textViewTitle.setText(stringTilte);
        textViewDescription.setText(stringDescription);
        imageViewImageBook.setImageResource(intImage);
    }
}
