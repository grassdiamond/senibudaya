package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sumatera(View view) {
        Intent intent = new Intent(home.this, sumatera.class);
        startActivity(intent);
    }

    public void jawa(View view) {
        Intent intent = new Intent(home.this, jawa.class);
        startActivity(intent);
    }

    public void ntbali(View view) {
        Intent intent = new Intent(home.this, ntbali.class);
        startActivity(intent);
    }

    public void malpa(View view) {
        Intent intent = new Intent(home.this, malpa.class);
        startActivity(intent);
    }

    public void kalimantan(View view) {
        Intent intent = new Intent(home.this, kalimantan.class);
        startActivity(intent);
    }

    public void sulawesi(View view) {
        Intent intent = new Intent(home.this, sulawesi.class);
        startActivity(intent);
    }

    public void close(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah Anda Yakin Ingin Keluar?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}