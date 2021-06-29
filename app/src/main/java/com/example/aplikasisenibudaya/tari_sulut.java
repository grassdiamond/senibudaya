package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_sulut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_sulut);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_sulut.this, info_sulut.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_sulut.this, video_sulut.class);
        startActivity(intent);
    }
}