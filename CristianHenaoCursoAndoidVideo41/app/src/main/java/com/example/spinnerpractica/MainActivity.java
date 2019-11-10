package com.example.spinnerpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView textViewSeleccion;
    private Spinner spinnerComboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

        ArrayList<String> stringArrayListComboDiasList = new ArrayList<String>();
        stringArrayListComboDiasList.add("Seleccion");
        stringArrayListComboDiasList.add("Lunes");
        stringArrayListComboDiasList.add("Martes");
        stringArrayListComboDiasList.add("Miercoles");
        stringArrayListComboDiasList.add("Jueves");
        stringArrayListComboDiasList.add("Viernes");
        stringArrayListComboDiasList.add("Sabado");
        stringArrayListComboDiasList.add("Domingo");

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, stringArrayListComboDiasList);

        spinnerComboDias.setAdapter(adapter);

        spinnerComboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Seleccionado: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

                textViewSeleccion.setText("Seleccion : " + adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void encontrarVistas(){
        textViewSeleccion = findViewById(R.id.MainActivity_TextView_Seleccion);
        spinnerComboDias = findViewById(R.id.MainActivity_Spinner_Dias);
    }
}
