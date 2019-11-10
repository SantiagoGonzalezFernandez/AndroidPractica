package com.example.listviewpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewDias;
    private TextView textViewSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

        ArrayList<String> stringArrayListNombres = new ArrayList<>();
        stringArrayListNombres.add("Cristian");
        stringArrayListNombres.add("Santy");
        stringArrayListNombres.add("Ezequiel");
        stringArrayListNombres.add("Maria");

        for (int i = 0; i<=10; i++){
            stringArrayListNombres.add("Nombre: " +i);
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, stringArrayListNombres);

        listViewDias.setAdapter(arrayAdapter);

        listViewDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Selecciona: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                textViewSeleccion.setText("Seleccion: " + adapterView.getItemAtPosition(i).toString());
            }
        });
    }

    private void encontrarVistas(){
        listViewDias = findViewById(R.id.MainActivity_ListView_Dias);
        textViewSeleccion = findViewById(R.id.MainActivity_TextView_Seleccion);
    }
}

