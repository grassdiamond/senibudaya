package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_ntt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_ntt);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_ntt.this, info_ntt.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_ntt.this, video_ntt.class);
        startActivity(intent);
    }
}