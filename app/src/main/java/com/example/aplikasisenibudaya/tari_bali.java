package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_bali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_bali);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_bali.this, info_bali.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_bali.this, video_bali.class);
        startActivity(intent);
    }
}