package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_maluku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_maluku);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_maluku.this, info_maluku.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_maluku.this, video_maluku.class);
        startActivity(intent);
    }
}