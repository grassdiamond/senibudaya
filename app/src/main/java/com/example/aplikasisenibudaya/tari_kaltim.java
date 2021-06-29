package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_kaltim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_kaltim);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_kaltim.this, info_kaltim.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_kaltim.this, video_kaltim.class);
        startActivity(intent);
    }
}