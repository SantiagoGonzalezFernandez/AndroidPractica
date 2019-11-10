package com.example.checkboxpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxOpcion1;
    private CheckBox checkBoxOpcion2;
    private Button buttonValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();
    }

    private void encontrarVistas(){
        checkBoxOpcion1 = findViewById(R.id.MainActivity_CheckBox_Opcion1);
        checkBoxOpcion2 = findViewById(R.id.MainActivity_CheckBox_Opcion2);
        buttonValidar = findViewById(R.id.MainActivity_Button_Validar);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.MainActivity_Button_Validar){
            validar();
        }
    }

    private void validar(){
        String stringMensaje = "Seleccionado: \n";

        if(checkBoxOpcion1.isChecked()){
            stringMensaje += "Opcion1\n";
        }

        if(checkBoxOpcion2.isChecked()){
            stringMensaje += "Opcion2";
        }

        Toast.makeText(getApplicationContext(), stringMensaje, Toast.LENGTH_SHORT).show();
    }
}
