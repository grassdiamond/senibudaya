package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sumatera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatera);
    }

    public void aceh(View view) {
        Intent intent = new Intent(sumatera.this, provinsi_aceh.class);
        startActivity(intent);
    }

    public void sumut(View view) {
        Intent intent = new Intent(sumatera.this, provinsi_sumut.class);
        startActivity(intent);
    }

    public void sumbar(View view) {
        Intent intent = new Intent(sumatera.this, provinsi_sumbar.class);
        startActivity(intent);
    }
}