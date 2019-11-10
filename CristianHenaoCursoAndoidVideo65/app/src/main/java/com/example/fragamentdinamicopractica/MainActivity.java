package com.example.fragamentdinamicopractica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
         implements RedFragment.OnFragmentInteractionListener,
                    GreenFragment.OnFragmentInteractionListener,
                    BlueFragment.OnFragmentInteractionListener{

    BlueFragment blueFragment;
    RedFragment redFragment;
    GreenFragment greenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueFragment = new BlueFragment();
        redFragment = new RedFragment();
        greenFragment = new GreenFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.MainActivity_FrameLayout_ContenedorFragments,redFragment).commit();
    }

    public void onClick(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.MainActivity_Button_Red:
                fragmentTransaction.replace(R.id.MainActivity_FrameLayout_ContenedorFragments, redFragment);
                break;
            case R.id.MainActivity_Button_Blue:
                fragmentTransaction.replace(R.id.MainActivity_FrameLayout_ContenedorFragments, blueFragment);
                break;
            case R.id.MainActivity_Button_Green:
                fragmentTransaction.replace(R.id.MainActivity_FrameLayout_ContenedorFragments, greenFragment);
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
