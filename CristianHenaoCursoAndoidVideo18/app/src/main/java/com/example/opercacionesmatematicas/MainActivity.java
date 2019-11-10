package com.example.opercacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumeroUno;
    private EditText editTextNumeroDos;
    private Button buttonSumar;
    private Button buttonRestar;
    private Button buttonMultiplicar;
    private Button buttonDividir;
    private TextView textViewResultado;
    private int intNumeroUno;
    private int intNumeroDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encontrarVistasPorId();

    }

    public void onClick(View view){

        intNumeroUno = Integer.parseInt(editTextNumeroUno.getText().toString());
        intNumeroDos = Integer.parseInt(editTextNumeroDos.getText().toString());

        switch (view.getId()){
            case R.id.MainActivity_Button_Sumar: sumar();
                break;
            case R.id.MainActivity_Button_Restar: restar();
                break;
            case R.id.MainActivity_Button_Multiplicar: multiplicar();
                break;
            case R.id.MainActivity_Button_Dividir: dividir();
                break;
        }
    }

    private void dividir() {

        if (intNumeroDos>0) {
            int intResultadoDivicion = intNumeroUno / intNumeroDos;
            textViewResultado.setText("El resultado de la division es: " + intResultadoDivicion);
        }else{
            Toast.makeText(this, "Advertencia!", Toast.LENGTH_SHORT).show();
            textViewResultado.setText("El numero 2 debe ser mayor a 0 para la division");
        }
    }

    private void multiplicar() {
        int intResultadoMultiplicacion = intNumeroUno * intNumeroDos;
        textViewResultado.setText("El resultado de la multiplicacion es: " +intResultadoMultiplicacion);
    }

    private void restar() {
        int intResultadoResta = intNumeroUno - intNumeroDos;
        textViewResultado.setText("El resultado de la resta es: " +intResultadoResta);
    }

    private void sumar() {
        int intResultadoSuma = intNumeroUno + intNumeroDos;
        textViewResultado.setText("El resultado de la suma es: " +intResultadoSuma);
    }

    private void encontrarVistasPorId(){
        editTextNumeroUno = findViewById(R.id.MainActivity_EditText_NumeroUno);
        editTextNumeroDos = findViewById(R.id.MainActivity_EditText_NumeroDos);
        buttonSumar = findViewById(R.id.MainActivity_Button_Sumar);
        buttonRestar = findViewById(R.id.MainActivity_Button_Restar);
        buttonMultiplicar = findViewById(R.id.MainActivity_Button_Multiplicar);
        buttonDividir = findViewById(R.id.MainActivity_Button_Dividir);
        textViewResultado = findViewById(R.id.MainActivity_TextView_Resultado);
    }

}
