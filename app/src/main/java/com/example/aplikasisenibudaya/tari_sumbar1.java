package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_sumbar1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_sumbar1);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_sumbar1.this, info_sumbar.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_sumbar1.this, video_sumbar.class);
        startActivity(intent);
    }
}