package com.example.sqlitepractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conexionSQLiteHelper = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
    }

    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.MainActivity_Button_RegistrarUsuario:
                intent = new Intent(MainActivity.this, RegistroUsuariosActivity.class);
                break;
        }
        if (intent!=null){
            startActivity(intent);
        }
    }
}
