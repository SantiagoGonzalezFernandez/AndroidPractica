package com.example.checkboxpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButtonOpcion1;
    private RadioButton radioButtonOpcion2;
    private Button buttonValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();
    }

    private void encontrarVistas(){
        radioButtonOpcion1 = findViewById(R.id.MainActivity_RadioButton_Opcion1);
        radioButtonOpcion2 = findViewById(R.id.MainActivity_RadioButton_Opcion2);
        buttonValidar = findViewById(R.id.MainActivity_Button_Validar);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.MainActivity_Button_Validar){
            validar();
        }
    }

    private void validar(){
        String stringMensaje = "Seleccionado: \n";

        if(radioButtonOpcion1.isChecked()){
            stringMensaje += "Opcion1";
        }

        if(radioButtonOpcion2.isChecked()){
            stringMensaje += "Opcion2";
        }

        Toast.makeText(getApplicationContext(), stringMensaje, Toast.LENGTH_SHORT).show();
    }
}
