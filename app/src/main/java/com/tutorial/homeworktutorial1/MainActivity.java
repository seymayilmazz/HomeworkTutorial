package com.tutorial.homeworktutorial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button   buttonGonder;
    private EditText editTextAd;
    private EditText editTextSoyad;
    private EditText editTextYas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Ana Ekran");

        buttonGonder= (Button) findViewById(R.id.ButtonGonder);
        editTextAd= (EditText) findViewById(R.id.EditTextAd);
        editTextSoyad= (EditText) findViewById(R.id.EditTextSoyAd);
        editTextYas= (EditText) findViewById(R.id.EditTextYas);


        buttonGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad = editTextAd.getText().toString();
                if(ad.length() == 0){
                    Toast.makeText(MainActivity.this, "Lütfen adı girin", Toast.LENGTH_LONG).show();
                    return;
                }


                int yas = Integer.parseInt( editTextYas.getText().toString() );
                if(yas<=0){
                    Toast.makeText(MainActivity.this,"yaş sıfırdan küçük olamaz",Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                String soyAD=editTextSoyad.getText().toString();
                if(soyAD.length()==0){
                    Toast.makeText(MainActivity.this,"Lütfen soyadınızı giriniz", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                Intent intentSoyad=new Intent(MainActivity.this,ShowActivity.class);
                intentSoyad.putExtra("kisiAd",ad);
                intentSoyad.putExtra("kisiSoyad",soyAD);
                intentSoyad.putExtra("kisiYas",yas);
                startActivity(intentSoyad);
            }



        });

    }
}
