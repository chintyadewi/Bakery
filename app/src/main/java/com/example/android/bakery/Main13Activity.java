package com.example.android.bakery;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Console;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main13Activity extends AppCompatActivity {
    Button btnincrement, btndecrement, btnSimpan, btnReset;
    int number, harga, total;
    String jenis;
    TextView nama, tgl_ambil, tambahan, jumlahTextView, nama_pemesan, alamat, hp;
    RadioButton rdBundar, rdKotak;
    EditText jumlah;

    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;
    private Button btDatePicker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        jumlahTextView=(TextView) findViewById(R.id.jumlah_text_view);
        btnincrement=(Button) findViewById(R.id.btn_increment);
        btndecrement=(Button) findViewById(R.id.btn_decrement);

        btnincrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number= Integer.parseInt(jumlah.getText().toString());
                number+=1;
                display(number);
            }
        });

        btndecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number= Integer.parseInt(jumlah.getText().toString());
                number-=1;
                if(number<0){
                    number=0;
                }
                display(number);
            }
        });

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        tvDateResult = (TextView) findViewById(R.id.tv_dateresult);
        btDatePicker = (Button) findViewById(R.id.bt_datepicker);
        btDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        nama = (TextView) findViewById(R.id.text1);
        jumlah = (EditText) findViewById(R.id.jumlah_text_view);
        tgl_ambil=(TextView) findViewById(R.id.tv_dateresult);
        tambahan = (TextView) findViewById(R.id.detail_tambahan);
        btnSimpan=(Button) findViewById(R.id.simpan);
        btnReset=(Button) findViewById(R.id.reset);
        rdBundar=(RadioButton) findViewById(R.id.bundar);
        rdKotak=(RadioButton) findViewById(R.id.kotak);
        nama_pemesan = (TextView) findViewById(R.id.nama_pemesan);
        alamat=(TextView) findViewById(R.id.alamat);
        hp=(TextView) findViewById(R.id.hp);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(rdBundar.isChecked()){
                    harga=210000;
                    jenis="Bundar";
                }
                else if(rdKotak.isChecked()){
                    harga=225000;
                    jenis="Kotak";
                }

                total=harga*number;

                Intent intent = new Intent(Main13Activity.this, Main8Activity.class);
                intent.putExtra("nama_pemesan", nama_pemesan.getText().toString());
                intent.putExtra("alamat", alamat.getText().toString());
                intent.putExtra("hp", hp.getText().toString());
                intent.putExtra("nama", nama.getText().toString());
                intent.putExtra("jenis", jenis);
                intent.putExtra("harga", harga);
                intent.putExtra("jumlah", jumlah.getText().toString());
                intent.putExtra("tgl_ambil", tgl_ambil.getText().toString());
                intent.putExtra("tambahan", tambahan.getText().toString());
                intent.putExtra("total", total);

                finish();
                startActivity(intent);
            }
        });

        ImageButton back=(ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama_pemesan.setText("");
                alamat.setText("");
                hp.setText("");
                rdBundar.setChecked(true);
                jumlahTextView.setText(""+0);
                number=0;
                tgl_ambil.setText("");
                tambahan.setText("");
            }
        });
    }

    private void showDateDialog(){

        Calendar newCalendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                tvDateResult.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();

    }

    private void display(int number) {
        jumlahTextView.setText(""+number);
    }

    public void back(){
        Intent intent= new Intent(this, Main2Activity.class);
        startActivity(intent);
        finish();
    };
}
