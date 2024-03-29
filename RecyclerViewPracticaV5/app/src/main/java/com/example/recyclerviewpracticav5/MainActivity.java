package com.example.recyclerviewpracticav5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.ListItemClick{

    private RecyclerView mRvListaNumeros;

    private static final int LISTA_NUMEROS = 100;

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRvListaNumeros = findViewById(R.id.rvNumeros);

        mRvListaNumeros.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRvListaNumeros.setLayoutManager(linearLayoutManager);

        RecyclerAdapter mAdapter = new RecyclerAdapter(LISTA_NUMEROS,this);

        mRvListaNumeros.setAdapter(mAdapter);

    }

    @Override
    public void onListItemClick(int clickedItem) {

        if(mToast != null){

            mToast.cancel();
        }

        String mensajeToast = "item #" + clickedItem + " clicado";

        mToast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        mToast.show();


    }
}
