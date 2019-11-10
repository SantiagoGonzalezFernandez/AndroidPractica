package com.example.pruebadesdecero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private Button buttonIngresar;
    private TextView textViewNombreRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

    }

    private void encontrarVistas(){
        editTextNombre = findViewById(R.id.MainActivity_EditText_Nombre);
        buttonIngresar = findViewById(R.id.MainActivity_Button_Ingresar);
        textViewNombreRecibido = findViewById(R.id.MainActivity_TextView_NombreRecibido);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.MainActivity_Button_Ingresar:
                String stringNombre = editTextNombre.getText().toString();
                textViewNombreRecibido.setText("Bienvenido: " + stringNombre);
                Toast.makeText(this, "El nombre es: " + stringNombre, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
