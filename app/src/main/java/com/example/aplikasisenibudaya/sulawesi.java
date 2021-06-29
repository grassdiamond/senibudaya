package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sulawesi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi);
    }

    public void sulut(View view) {
        Intent intent = new Intent(sulawesi.this, provinsi_sulut.class);
        startActivity(intent);
    }

    public void sulteng(View view) {
        Intent intent = new Intent(sulawesi.this, provinsi_sulteng.class);
        startActivity(intent);
    }

    public void sulsel(View view) {
        Intent intent = new Intent(sulawesi.this, provinsi_sulsel.class);
        startActivity(intent);
    }
}