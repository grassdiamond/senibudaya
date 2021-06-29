package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class malpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malpa);
    }

    public void maluku(View view) {
        Intent intent = new Intent(malpa.this, provinsi_maluku.class);
        startActivity(intent);
    }

    public void papua(View view) {
        Intent intent = new Intent(malpa.this, provinsi_papua.class);
        startActivity(intent);
    }

    public void papbar(View view) {
        Intent intent = new Intent(malpa.this, provinsi_pabar.class);
        startActivity(intent);
    }
}