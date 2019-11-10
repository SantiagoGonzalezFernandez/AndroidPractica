package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //El contexto es donde estamos parados
        Toast.makeText(getApplicationContext(), "Hola este es un Toast", Toast.LENGTH_LONG).show();
    }
}
