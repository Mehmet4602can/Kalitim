package com.example.miraskalitim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText arabaHizi, kapıSayisi, otobusHiz, otobusKapiSayisi, yolcuAl, yolcuIndir;
    Button iseGit, yolcuBindir, yolcuAt;
    TextView iseGitSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arabaHizi = findViewById(R.id.arabaHizi);
        kapıSayisi = findViewById(R.id.kapiSayisi);
        otobusHiz = findViewById(R.id.otobusHız);
        otobusKapiSayisi = findViewById(R.id.otobusKapıSayisi);
        yolcuAl = findViewById(R.id.yolcuAl);
        yolcuIndir = findViewById(R.id.yolcuIndir);

        iseGitSonuc = findViewById(R.id.isegitSonuc);

        iseGit = findViewById(R.id.iseGit);
        iseGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Araba araba = new Araba();
                araba.setMaksHiz(Integer.parseInt(arabaHizi.getText().toString()));
                araba.setKapiSayisi(Integer.parseInt(kapıSayisi.getText().toString()));
                iseGitSonuc.setText("Arabanız "+araba.getKapiSayisi()+" Kapılıdır ve "+araba.getMaksHiz()+"km/h hızla işe gitmektedir.");
            }
        });

        yolcuBindir = findViewById(R.id.yolcuBindir);
        yolcuBindir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        yolcuAt = findViewById(R.id.yolcuAt);
        yolcuAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}