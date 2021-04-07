package com.example.rajaindra;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void clickRS(View view) {
        //gambar RS di klik
        Intent i = new Intent(this, RumahSakit.class);
        startActivity(i);
    }

    public void clickMasjid(View view) {
        //gambar masjid di klik
        Intent i = new Intent(this, Masjid.class);
        startActivity(i);
    }

    public void clickBank(View view) {
        //gambar Bank di klik
        Intent i = new Intent(this, Bank.class);
        startActivity(i);
    }

    public void clickMall(View view) {
        //gambar Mall di klik
        Intent i = new Intent(this, Mall.class);
        startActivity(i);
    }
}