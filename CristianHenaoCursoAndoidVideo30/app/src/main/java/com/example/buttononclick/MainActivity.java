package com.example.buttononclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonClaseAnonima;
    private Button buttonImplements;
    private Button buttonOnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

        buttonImplements.setOnClickListener(this);

        buttonClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la Anonima", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void encontrarVistas(){
        buttonClaseAnonima = findViewById(R.id.MainActivity_Button_ClaseAnonima);
        buttonImplements = findViewById(R.id.MainActivity_Button_Implements);
        buttonOnClick = findViewById(R.id.MainActivity_Button_onClick);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.MainActivity_Button_onClick:
                Toast.makeText(getApplicationContext(), "Desde el onClick del metodo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.MainActivity_Button_Implements:
                Toast.makeText(getApplicationContext(), "Desde el onClick del Implements", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
