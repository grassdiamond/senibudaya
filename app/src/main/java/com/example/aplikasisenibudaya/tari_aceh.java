package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_aceh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_aceh);
    }

    public void info_saman(View view) {
        Intent intent = new Intent(tari_aceh.this, info_aceh.class);
        startActivity(intent);
    }

    public void video_saman(View view) {
        Intent intent = new Intent(tari_aceh.this, video_aceh.class);
        startActivity(intent);
    }
}