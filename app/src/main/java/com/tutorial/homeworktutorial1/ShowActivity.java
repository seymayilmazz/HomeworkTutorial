package com.tutorial.homeworktutorial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    private  TextView textViewAd;
    private  TextView textViewSoyad;
    private  TextView textViewYas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        getSupportActionBar().setTitle("Gösterim Ekranı");


        textViewAd= (TextView) findViewById(R.id.textViewAd);
        textViewSoyad= (TextView) findViewById(R.id.textViewSoyad);
        textViewYas= (TextView) findViewById(R.id.textViewYas);


        Intent intent = getIntent();
        String ad = intent.getStringExtra("kisiAd");
        textViewAd.setText(ad);


        String soyad=intent.getStringExtra("kisiSoyad");
        textViewSoyad.setText(soyad);

        int yas=intent.getIntExtra("kisiYas", 0);
        textViewYas.setText(String.valueOf(yas));
    }
}
