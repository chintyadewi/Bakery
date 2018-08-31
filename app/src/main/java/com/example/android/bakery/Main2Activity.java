package com.example.android.bakery;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton imgMenu1=(ImageButton) findViewById(R.id.bfOrder);
        ImageButton imgMenu2=(ImageButton) findViewById(R.id.cupOrder);
        ImageButton imgMenu3=(ImageButton) findViewById(R.id.cheeseOrder);
        ImageButton imgMenu4=(ImageButton) findViewById(R.id.rollOrder);
        ImageButton imgMenu5=(ImageButton) findViewById(R.id.tartOrder);
        ImageButton imgMenu6=(ImageButton) findViewById(R.id.browniesOrder);
        ImageButton imgMenu7=(ImageButton) findViewById(R.id.rainbowOrder);
        ImageButton back=(ImageButton) findViewById(R.id.back);

        imgMenu1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu1();
            }
        });

        imgMenu2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu2();
            }
        });

        imgMenu3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu3();
            }
        });

        imgMenu4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu4();
            }
        });

        imgMenu5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu5();
            }
        });

        imgMenu6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu6();
            }
        });

        imgMenu7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenu7();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
    }

    public void openMenu1(){
        Intent intent= new Intent(this, Main6Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu2(){
        Intent intent= new Intent(this, Main7Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu3(){
        Intent intent= new Intent(this, Main9Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu4(){
        Intent intent= new Intent(this, Main10Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu5(){
        Intent intent= new Intent(this, Main11Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu6(){
        Intent intent= new Intent(this, Main12Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu7(){
        Intent intent= new Intent(this, Main13Activity.class);
        finish();
        startActivity(intent);
    };

    public void back(){
        Intent intent= new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    };
}
