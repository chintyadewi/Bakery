package com.example.android.bakery;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class Main8Activity extends AppCompatActivity {
    TextView tv_nama, tv_jenis, tv_harga, tv_jumlah, tv_tgl_ambil, tv_tambahan, tv_total, nama, alamat, hp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        tv_nama=(TextView) findViewById(R.id.nama);
        tv_jenis=(TextView) findViewById(R.id.jenis);
        tv_harga=(TextView) findViewById(R.id.harga);
        tv_jumlah=(TextView) findViewById(R.id.jumlah);
        tv_tgl_ambil=(TextView) findViewById(R.id.tgl_ambil);
        tv_tambahan=(TextView) findViewById(R.id.tambahan);
        tv_total=(TextView) findViewById(R.id.total);

        tv_nama.setText(getIntent().getStringExtra("nama"));
        tv_jenis.setText(getIntent().getStringExtra("jenis"));

        Intent intent=getIntent();
        int harga=intent.getIntExtra("harga", 0);
        tv_harga.setText(NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(harga));

        tv_jumlah.setText(getIntent().getStringExtra("jumlah"));
        tv_tgl_ambil.setText(getIntent().getStringExtra("tgl_ambil"));
        tv_tambahan.setText(getIntent().getStringExtra("tambahan"));

        int total=intent.getIntExtra("total", 0);
        tv_total.setText(NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(total));

        nama = (TextView) findViewById(R.id.nama_pemesan);
        alamat=(TextView) findViewById(R.id.alamat);
        hp=(TextView) findViewById(R.id.hp);

        nama.setText(getIntent().getStringExtra("nama_pemesan"));
        alamat.setText(getIntent().getStringExtra("alamat"));
        hp.setText(getIntent().getStringExtra("hp"));
    }

    public void selesai() {
        Intent intent = new Intent(Main8Activity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
