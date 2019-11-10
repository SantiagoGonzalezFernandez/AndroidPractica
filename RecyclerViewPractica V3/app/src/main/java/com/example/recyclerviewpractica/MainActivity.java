package com.example.recyclerviewpractica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> stringArrayListNamesContrys = new ArrayList<>();
    private ArrayList<String> stringArrayListImagesUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        stringArrayListImagesUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        stringArrayListNamesContrys.add("Havasu Falls");

        stringArrayListImagesUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        stringArrayListNamesContrys.add("Trondheim");

        stringArrayListImagesUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        stringArrayListNamesContrys.add("Portugal");

        stringArrayListImagesUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        stringArrayListNamesContrys.add("Rocky Mountain National Park");


        stringArrayListImagesUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        stringArrayListNamesContrys.add("Mahahual");

        stringArrayListImagesUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        stringArrayListNamesContrys.add("Frozen Lake");


        stringArrayListImagesUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        stringArrayListNamesContrys.add("White Sands Desert");

        stringArrayListImagesUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        stringArrayListNamesContrys.add("Austrailia");

        stringArrayListImagesUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        stringArrayListNamesContrys.add("Washington");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.MainActivity_RecyclerView);
        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(stringArrayListNamesContrys, stringArrayListImagesUrls,this);
        recyclerView.setAdapter(adapterRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
