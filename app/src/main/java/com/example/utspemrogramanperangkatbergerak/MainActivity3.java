package com.example.utspemrogramanperangkatbergerak;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextNamaKelompok;
    private EditText editTextNama1;
    private EditText editTextNama2;
    private EditText editTextNama3;
    private Button buttonSimpan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNamaKelompok = findViewById(R.id.editTextNamaKelompok);
        editTextNama1 = findViewById(R.id.editTextNama1);
        editTextNama2 = findViewById(R.id.editTextNama2);
        editTextNama3 = findViewById(R.id.editTextNama3);
        buttonSimpan = findViewById(R.id.buttonSimpan);

        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaKelompok = editTextNamaKelompok.getText().toString();
                String nama1 = editTextNama1.getText().toString();
                String nama2 = editTextNama2.getText().toString();
                String nama3 = editTextNama3.getText().toString();
                String nama4 = editTextNama3.getText().toString();
                String nama5 = editTextNama3.getText().toString();

                // Proses penyimpanan data biodata
                // (Anda bisa menggunakan Toast untuk menampilkan pesan konfirmasi)
                Toast.makeText(MainActivity3.this, "Data tersimpan!", Toast.LENGTH_SHORT).show();

                // (Opsional) Kosongkan input text setelah klik simpan
                editTextNamaKelompok.setText("");
                editTextNama1.setText("");
                editTextNama2.setText("");
                editTextNama3.setText("");
            }
        });
    }
}
