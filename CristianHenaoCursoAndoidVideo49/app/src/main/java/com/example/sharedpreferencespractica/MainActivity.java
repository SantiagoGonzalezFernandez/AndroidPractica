package com.example.sharedpreferencespractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private TextView textViewUsername;
    private TextView textViewPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistas();

        cargarPreferencias();
    }

    private void encontrarVistas(){
        editTextPassword = findViewById(R.id.MainActivity_EditText_Password);
        editTextUsername = findViewById(R.id.MainActivity_EditText_Username);
        textViewUsername = findViewById(R.id.MainActivity_TextView_Username);
        textViewPassword = findViewById(R.id.MainActivity_TextView_Password);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.MainActivity_Button_Guardar:
                guardarPreferencias();
                break;
            case R.id.MainActivity_Button_Cargar:
                Intent intent = new Intent(getApplicationContext(), ConsultaPreferenciasActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void guardarPreferencias() {
        SharedPreferences sharedPreferences = getSharedPreferences("Credenciales", Context.MODE_PRIVATE);

        String stringUsername = editTextUsername.getText().toString();
        String stringPassword = editTextPassword.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("username", stringUsername);
        editor.putString("password", stringPassword);

        textViewUsername.setText(stringUsername);
        textViewPassword.setText(stringPassword);

        editor.commit();
    }

    private void cargarPreferencias() {
        SharedPreferences sharedPreferences = getSharedPreferences("Credenciales", Context.MODE_PRIVATE);

        String stringUsername = sharedPreferences.getString("username","No existe la Informacion");
        String stringPassword = sharedPreferences.getString("password","No existe la Informacion");

        textViewUsername.setText(stringUsername);
        textViewPassword.setText(stringPassword);
    }
}
