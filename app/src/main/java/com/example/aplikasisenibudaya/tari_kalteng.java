package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_kalteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_kalteng);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_kalteng.this, info_kalteng.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_kalteng.this, video_kalteng.class);
        startActivity(intent);
    }
}