package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton1;
    private TextView textViewEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();
    }

    private void encontrarVistas(){
        toggleButton1 = findViewById(R.id.MainActivity_ToggleButton_1);
        textViewEstado = findViewById(R.id.MainActivity_TextView_Estado);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.MainActivity_ToggleButton_1){
            if (toggleButton1.isChecked()){
                textViewEstado.setText("Boton ON");
            }else{
                textViewEstado.setText("Boton OFF");
            }
        }
    }
}
