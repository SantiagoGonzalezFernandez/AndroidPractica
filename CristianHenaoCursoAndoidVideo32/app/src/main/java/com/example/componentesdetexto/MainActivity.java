package com.example.componentesdetexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitulo;
    private EditText editTextDocumento;
    private EditText editTextNombre;
    private EditText editTextTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();


    }

    private void encontrarVistas(){
        textViewTitulo = findViewById(R.id.MainActivity_TextView_Titulo);
        editTextDocumento = findViewById(R.id.MainActivity_EditText_Documento);
        editTextNombre = findViewById(R.id.MainActivity_EditText_Nombre);
        editTextTexto = findViewById(R.id.MainActivity_EditText_Texto);
    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.MainActivity_Button_Ingresar:
                obtenerInformacion();
                break;
        }
    }

    private void obtenerInformacion() {
        int intDocumento = Integer.parseInt(editTextDocumento.getText().toString());
        String stringNombre = editTextNombre.getText().toString();
        String stringTexto = editTextTexto.getText().toString();

        textViewTitulo.setText("Nuevo titulo!");

        Toast.makeText(getApplicationContext(), "Documento: " + intDocumento, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Nombre: " + stringNombre, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Texto: " + stringTexto, Toast.LENGTH_SHORT).show();
    }

}
