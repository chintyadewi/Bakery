package com.example.android.bakery;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageButton imgMenu1=(ImageButton) findViewById(R.id.bikangOrder);
        ImageButton imgMenu2=(ImageButton) findViewById(R.id.ondeOrder);
        ImageButton imgMenu3=(ImageButton) findViewById(R.id.lapisOrder);
        ImageButton imgMenu4=(ImageButton) findViewById(R.id.dadarOrder);
        ImageButton imgMenu5=(ImageButton) findViewById(R.id.lemperOrder);
        ImageButton imgMenu6=(ImageButton) findViewById(R.id.putuOrder);
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

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
    }

    public void openMenu1(){
        Intent intent= new Intent(this, Main29Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu2(){
        Intent intent= new Intent(this, Main30Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu3(){
        Intent intent= new Intent(this, Main31Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu4(){
        Intent intent= new Intent(this, Main32Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu5(){
        Intent intent= new Intent(this, Main33Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu6(){
        Intent intent= new Intent(this, Main34Activity.class);
        finish();
        startActivity(intent);
    };

    public void back(){
        Intent intent= new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    };
}
