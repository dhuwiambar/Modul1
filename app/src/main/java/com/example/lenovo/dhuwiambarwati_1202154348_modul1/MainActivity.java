package com.example.lenovo.dhuwiambarwati_1202154348_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText bMenu,bjumlahPesanan;
    Button bButton1,bButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bMenu = findViewById(R.id.editText1);
        bjumlahPesanan = findViewById(R.id.editText2);
        bButton1 = findViewById(R.id.button1);
        bButton2 = findViewById(R.id.button2);

        bButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
        pindah.putExtra("tempatMakan","Eatbus");
        pindah.putExtra("menu",bMenu.getText().toString());
        pindah.putExtra("jumlahpesanan", bjumlahPesanan.getText().toString());
        pindah.putExtra("harga","50000");
        startActivity(pindah);
            }
        });
        bButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent( MainActivity.this,Main2Activity.class);
                pindah.putExtra("tempatMakan", "Abnormal");
                pindah.putExtra("menu", bMenu.getText().toString() );
                pindah.putExtra("jumlahpesanan", bjumlahPesanan.getText().toString());
                pindah.putExtra("harga", "30000");
                startActivity(pindah);
            }
            });

    }
}