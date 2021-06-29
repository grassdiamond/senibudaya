package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class jawa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);
    }

    public void jakarta(View view) {
        Intent intent = new Intent(jawa.this, provinsi_jakarta.class);
        startActivity(intent);
    }

    public void jabar(View view) {
        Intent intent = new Intent(jawa.this, provinsi_jabar.class);
        startActivity(intent);
    }

    public void jatim(View view) {
        Intent intent = new Intent(jawa.this, provinsi_jatim.class);
        startActivity(intent);
    }
}