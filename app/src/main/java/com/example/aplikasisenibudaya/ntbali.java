package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ntbali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntbali);
    }

    public void bali(View view) {
        Intent intent = new Intent(ntbali.this, bali.class);
        startActivity(intent);
    }

    public void ntb(View view) {
        Intent intent = new Intent(ntbali.this, provinsi_ntb.class);
        startActivity(intent);
    }

    public void ntt(View view) {
        Intent intent = new Intent(ntbali.this, provinsi_ntt.class);
        startActivity(intent);
    }
}