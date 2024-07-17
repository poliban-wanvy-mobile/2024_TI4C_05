package com.example.utspemrogramanperangkatbergerak;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText etNilaia, etNilaib;
    private TextView tvhsl_hitung;
    private Button btn_hitung;
    private Button btBiodata;
    //Deklarasi variabel lainnya
    private RadioButton rbTambah, rbKurang, rbKali, rbBagi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etNilaia = findViewById(R.id.etNilaia);
        etNilaib = findViewById(R.id.etNilaib);
        tvhsl_hitung = findViewById(R.id.tvhsl_hitung);
        btn_hitung = findViewById(R.id.btn_hitung);
        rbTambah = findViewById(R.id.rbTambah);
        rbKurang = findViewById(R.id.rbKurang);
        rbKali = findViewById(R.id.rbKali);
        rbBagi = findViewById(R.id.rbBagi);
        btBiodata = findViewById(R.id.btBiodata);


        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNilaia.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Nilai A nya Masih Kosong!!", Toast.LENGTH_SHORT).show();
                } else if (etNilaib.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Nilai B nya Masih Kosong!!!", Toast.LENGTH_SHORT).show();
                } else {
                    double NilaiA = Double.valueOf(etNilaia.getText().toString());
                    double NilaiB = Double.valueOf(etNilaib.getText().toString());
                    double Hasil = 0;

                    if (rbTambah.isChecked()) {
                        Hasil = NilaiA + NilaiB;
                    } else if (rbKurang.isChecked()) {
                        Hasil = NilaiA - NilaiB;
                    } else if (rbKali.isChecked()) {
                        Hasil = NilaiA * NilaiB;
                    } else if (rbBagi.isChecked()) {
                        Hasil = NilaiA / NilaiB;
                    } else {
                        Toast.makeText(MainActivity2.this, "Silahkan Pilih Operatornya Terlebih Dahulu!!!", Toast.LENGTH_SHORT).show();
                        return; // Keluar dari onClick jika operator tidak dipilih
                    }

                    tvhsl_hitung.setText(String.valueOf(Hasil));
                }
            }
        });
        btBiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}