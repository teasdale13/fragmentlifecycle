package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentexample.fragment.FirstFragment;
import com.example.fragmentexample.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button fragmentNoTwo = findViewById( R.id.button2 );
        Button fragmentNoOne = findViewById( R.id.button );

        fragmentNoOne.setOnClickListener( this );
        fragmentNoTwo.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2 :
                SecondFragment secondFragment = new SecondFragment();
                // Le R.id.fragment représente la "boite" déclarée dans le XML qui accueillera le/les fragment(s)
                getSupportFragmentManager().beginTransaction().replace( R.id.fragment, secondFragment ).commit();
                break;
            case R.id.button :
                FirstFragment firstFragment = new FirstFragment();
                getSupportFragmentManager().beginTransaction().replace( R.id.fragment, firstFragment ).commit();
                break;
        }
    }
}
