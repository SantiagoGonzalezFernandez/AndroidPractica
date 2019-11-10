package com.example.sqlitepractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sqlitepractica.utilidades.Utilidades;

public class RegistroUsuariosActivity extends AppCompatActivity {

    private EditText editTextId;
    private EditText editTextNombre;
    private EditText editTextTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        encontrarVistas();
    }

    private void encontrarVistas(){
        editTextId = findViewById(R.id.RegistroUsuariosActivity_EditText_Id);
        editTextNombre = findViewById(R.id.RegistroUsuariosActivity_EditText_Nombre);
        editTextTelefono = findViewById(R.id.RegistroUsuariosActivity_EditText_Telefono);
    }

    public void onClick(View view) {
        //registrarUsuarios();
        registrarUsuariosSql();
    }

    private void registrarUsuariosSql() {
        ConexionSQLiteHelper conexionSQLiteHelper = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);

        SQLiteDatabase database = conexionSQLiteHelper.getWritableDatabase();

        //insert into usuario(id,nombre,telefono) values (123,'Cristian', '6345543545)

        String insert="INSERT INTO " + Utilidades.TABLA_USUARIO + " ( " +Utilidades.CAMPO_ID+","+ Utilidades.CAMPO_NOMBRE+","+Utilidades.CAMPO_TELEFONO+")"+" VALUES ("+editTextId.getText().toString()+", '"+ editTextNombre.getText().toString()+"','"+editTextTelefono.getText().toString()+"')";

        database.execSQL(insert);

        database.close();
    }

    private void registrarUsuarios() {
        ConexionSQLiteHelper conexionSQLiteHelper = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);

        SQLiteDatabase database = conexionSQLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID,editTextId.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,editTextNombre.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO,editTextTelefono.getText().toString());

        Long idResultante = database.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID, values);

        Toast.makeText(this, "Id Registro: " + idResultante, Toast.LENGTH_SHORT).show();

        database.close();
    }
}
