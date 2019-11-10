package com.example.navegacionactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InstruccionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);
    }

    public void onClick(View view) {

        Intent intent= null;

        switch (view.getId()){

            case R.id.InstruccionesActivity_Button_Regresar:
                intent = new Intent(InstruccionesActivity.this, MainActivity.class);
                break;
            case R.id.InstruccionesActivity_Button_Siguiente:
                intent = new Intent(InstruccionesActivity.this, SaludoActivity.class);
                break;
        }
        startActivity(intent);
    }
}
