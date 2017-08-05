package com.example.aris.kejar1;

import android.content.Intent;
import android.icu.text.StringSearch;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Kejarawal extends AppCompatActivity {
    ImageView keboen,andro;
    TextView text1, text2;
    int i1,i2,i3,i4;
    Button ketuk1,ketuk2;
    String s1,s2,s3,s4,b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kejarawal);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        keboen = (ImageView) findViewById(R.id.keboen);
        andro = (ImageView) findViewById(R.id.androo);
        ketuk1 = (Button) findViewById(R.id.click1);
        ketuk2 = (Button) findViewById(R.id.click2);
        i1 = R.drawable.hotel;
        i2 = R.drawable.room;
        i3 = R.drawable.keboen;
        i4 = R.drawable.android;

        s1 = "MARGO HOTEL";
        s2 = "KAMAR";
        s3 = "KEBON CODING";
        s4 = "DEPOK";

        b1 = "ROOM";
        b2 = "HOTEL";
        b3 = "BOOKING";
        b4 = "SHARE";

        //mangil yang berubah
        ketuk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setObjek(i1,i2,s1,s2,b1,b2);
            }
        });
    }
    private void setObjek (int i1, int i2,  String s1, String s2, String b1, String b2){
        keboen.setImageResource(i1);
        andro.setImageResource(i2);

        text1.setText(s1);
        text2.setText(s2);

    }

}
