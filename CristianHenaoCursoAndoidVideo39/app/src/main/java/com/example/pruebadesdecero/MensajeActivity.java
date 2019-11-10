package com.example.pruebadesdecero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    private TextView textViewBienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        encontrarVistas();

        Bundle bundle = this.getIntent().getExtras();

        if(bundle != null){

            String stringNombre = bundle.getString("nombre");
            String stringMensaje = getString(R.string.TextView_NombreRecibido);
            textViewBienvenido.setText(stringMensaje + " " + stringNombre);
        }
    }

    private void encontrarVistas(){
        textViewBienvenido = findViewById(R.id.MensajeActivity_TextView_Bienvenido);
    }

    public void onClick(View view) {
        finish();
    }
}
