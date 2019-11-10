package com.example.listviewpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.arrayDias, R.layout.support_simple_spinner_dropdown_item);

        listViewDias.setAdapter(adapter);

        listViewDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(), "Selecciona: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void encontrarVistas(){
        listViewDias = findViewById(R.id.MainActivity_ListView_Dias);
    }
}

