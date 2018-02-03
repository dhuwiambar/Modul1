package com.example.lenovo.dhuwiambarwati_1202154348_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView namaTempat;
    TextView namaMenu;
    TextView Jumlah;
    TextView TotalHarga;
    private  final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namaTempat = findViewById(R.id.textView10);
        namaMenu = findViewById(R.id.textView4);
        Jumlah = findViewById(R.id.textView7);
        TotalHarga = findViewById(R.id.textView9);

        Intent mainsatu = getIntent();

        String Tempat=mainsatu.getStringExtra("tempatMakan");
        String nmMenu=mainsatu.getStringExtra("menu");
        String jumlah=mainsatu.getStringExtra("jumlahpesanan");
        String Totalharga=mainsatu.getStringExtra("harga");

        int JumlahHarga = Integer.valueOf(Totalharga)*Integer.valueOf(jumlah);

        namaTempat.setText(Tempat);
        namaMenu.setText(nmMenu);
        Jumlah.setText(jumlah);
        TotalHarga.setText(String.valueOf(JumlahHarga));

        if (JumlahHarga <= uang) {
            Toast.makeText(this, "makan malam disini? Bisaaa", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this," Anda makan malam disini? Jangaaaann", Toast.LENGTH_LONG).show();

        }


    }
}
