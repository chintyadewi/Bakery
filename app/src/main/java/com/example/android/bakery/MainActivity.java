package com.example.android.bakery;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgMenu1=(ImageButton) findViewById(R.id.cake_tart);
        ImageButton imgMenu2=(ImageButton) findViewById(R.id.kering);
        ImageButton imgMenu3=(ImageButton) findViewById(R.id.roti);
        ImageButton imgMenu4=(ImageButton) findViewById(R.id.tradisional);
        ImageButton imgMenu5=(ImageButton) findViewById(R.id.facebook);
        ImageButton imgMenu6=(ImageButton) findViewById(R.id.instagram);

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
    }

    public void openMenu1(){
        Intent intent= new Intent(this, Main2Activity.class);
        startActivity(intent);
    };

    public void openMenu2(){
        Intent intent= new Intent(this, Main3Activity.class);
        startActivity(intent);
    };

    public void openMenu3(){
        Intent intent=new Intent(this, Main4Activity.class);
        startActivity(intent);
    };

    public void openMenu4(){
        Intent intent= new Intent(this, Main5Activity.class);
        startActivity(intent);
    };

    public void openMenu5(){
        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.facebook.com"));
        startActivity(intent);
    };

    public void openMenu6(){
        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.instagram.com/bakerydevi/"));
        startActivity(intent);
    };
}
