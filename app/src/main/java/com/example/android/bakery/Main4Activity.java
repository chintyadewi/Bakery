package com.example.android.bakery;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageButton imgMenu1=(ImageButton) findViewById(R.id.sobekOrder);
        ImageButton imgMenu2=(ImageButton) findViewById(R.id.tawarOrder);
        ImageButton imgMenu3=(ImageButton) findViewById(R.id.bluderOrder);
        ImageButton imgMenu4=(ImageButton) findViewById(R.id.sosisOrder);
        ImageButton imgMenu5=(ImageButton) findViewById(R.id.donatOrder);
        ImageButton imgMenu6=(ImageButton) findViewById(R.id.pizzaOrder);
        ImageButton imgMenu7=(ImageButton) findViewById(R.id.isiOrder);
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
        Intent intent= new Intent(this, Main22Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu2(){
        Intent intent= new Intent(this, Main23Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu3(){
        Intent intent= new Intent(this, Main24Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu4(){
        Intent intent= new Intent(this, Main25Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu5(){
        Intent intent= new Intent(this, Main26Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu6(){
        Intent intent= new Intent(this, Main27Activity.class);
        finish();
        startActivity(intent);
    };

    public void openMenu7(){
        Intent intent= new Intent(this, Main28Activity.class);
        finish();
        startActivity(intent);
    };

    public void back(){
        Intent intent= new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    };
}
