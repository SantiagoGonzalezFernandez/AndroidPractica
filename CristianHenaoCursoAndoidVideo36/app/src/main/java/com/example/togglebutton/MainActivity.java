package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView textViewEstado;
    private Switch switchOpcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

    }

    private void encontrarVistas(){
        textViewEstado = findViewById(R.id.MainActivity_TextView_Estado);
        switchOpcion = findViewById(R.id.MainActivity_Switch_Opcion);
    }

    public void onClick(View view) {
        if (view.getId()== R.id.MainActivity_Switch_Opcion){
            if (switchOpcion.isChecked()){
                textViewEstado.setText("Fue Activado");
            }else{
                textViewEstado.setText("Fue Inactivado");
            }
        }
    }
}
