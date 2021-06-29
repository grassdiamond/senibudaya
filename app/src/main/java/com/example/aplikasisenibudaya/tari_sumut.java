package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_sumut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_sumut);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_sumut.this, info_sumut.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_sumut.this, video_sumut.class);
        startActivity(intent);
    }
}