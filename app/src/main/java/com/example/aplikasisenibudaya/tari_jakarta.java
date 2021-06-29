package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_jakarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_jakarta);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_jakarta.this, info_jakarta.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_jakarta.this, video_jakarta.class);
        startActivity(intent);
    }
}