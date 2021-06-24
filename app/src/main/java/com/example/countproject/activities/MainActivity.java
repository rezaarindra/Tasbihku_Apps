package com.example.countproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.countproject.activities.AlquranActivity;

public class MainActivity extends AppCompatActivity {

    int counter;

    Button tambah, kurang, reset, btnnews;
    TextView nilai;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        tambah = (Button)findViewById(R.id.btnTambah);
        kurang = (Button)findViewById(R.id.btnKurang);
        reset  = (Button)findViewById(R.id.btnReset);
        nilai  = (TextView)findViewById(R.id.txtNilai);
        nilai.setText("" + counter);

        tambah.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter++;
                nilai.setText("" + counter);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter--;
                nilai.setText("" + counter);
            }
        });

        reset.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                counter = 0;
                nilai.setText("" + counter);
            }
        });


        Button btnalquran = findViewById(R.id.btnalquran);
        btnalquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AlquranActivity.class);
                startActivity(intent);

            }
        });

    }
}