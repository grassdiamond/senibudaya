package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kalimantan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan);
    }

    public void kalbar(View view) {
        Intent intent = new Intent(kalimantan.this, provinsi_kalbar.class);
        startActivity(intent);
    }

    public void kalteng(View view) {
        Intent intent = new Intent(kalimantan.this, provinsi_kalteng.class);
        startActivity(intent);
    }

    public void kaltim(View view) {
        Intent intent = new Intent(kalimantan.this, provinsi_kaltim.class);
        startActivity(intent);
    }
}