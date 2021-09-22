package com.example.ottanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15,ib16,ib17,ib18,ib19,ib20,ib21,ib22,ib23,ib24,
            ib25,ib26,ib27,ib28,ib29,ib30,ib31,ib32,ib33,ib34,ib35,ib36,ib37;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib1=(ImageButton) findViewById(R.id.addatimes);
        ib2=(ImageButton) findViewById(R.id.aha);
        ib3=(ImageButton) findViewById(R.id.akonline);
        ib4=(ImageButton) findViewById(R.id.altbalaji);
        ib5=(ImageButton) findViewById(R.id.amazonprime);
        ib6=(ImageButton) findViewById(R.id.arre);
        ib7=(ImageButton) findViewById(R.id.asianet);
        ib8=(ImageButton) findViewById(R.id.bigflix);
        ib9=(ImageButton) findViewById(R.id.bsvalue);
        ib10=(ImageButton) findViewById(R.id.hotstar);
        ib11=(ImageButton) findViewById(R.id.donmovie);
        ib12=(ImageButton) findViewById(R.id.erosnow);
        ib13=(ImageButton) findViewById(R.id.filmybox);
        ib14=(ImageButton) findViewById(R.id.hoichoi);
        ib15=(ImageButton) findViewById(R.id.hungama);
        ib16=(ImageButton) findViewById(R.id.jiocinema);
        ib17=(ImageButton) findViewById(R.id.manoramamax);
        ib18=(ImageButton) findViewById(R.id.mubi);
        ib19=(ImageButton) findViewById(R.id.mxplayer);
        ib20=(ImageButton) findViewById(R.id.neestream);
        ib21=(ImageButton) findViewById(R.id.netflix);
        ib22=(ImageButton) findViewById(R.id.niri9);
        ib23=(ImageButton) findViewById(R.id.ollyplus);
        ib24=(ImageButton) findViewById(R.id.planetmarathi);
        ib25=(ImageButton) findViewById(R.id.shemaroome);
        ib26=(ImageButton) findViewById(R.id.sonyliv);
        ib27=(ImageButton) findViewById(R.id.spuul);
        ib28=(ImageButton) findViewById(R.id.sunnxt);
        ib29=(ImageButton) findViewById(R.id.tvfplay);
        ib30=(ImageButton) findViewById(R.id.ullu);
        ib31=(ImageButton) findViewById(R.id.viki);
        ib32=(ImageButton) findViewById(R.id.viu);
        ib33=(ImageButton) findViewById(R.id.voot);
        ib34=(ImageButton) findViewById(R.id.vuclip);
        ib35=(ImageButton) findViewById(R.id.watcho);
        ib36=(ImageButton) findViewById(R.id.yupptv);
        ib37=(ImageButton) findViewById(R.id.zee5);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openactivity1();
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity4();
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity5();
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity6();
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity7();
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity8();
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity9();
            }
        });
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity10();
            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity11();
            }
        });
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity12();
            }
        });
        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity13();
            }
        });
        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity14();
            }
        });
        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity15();
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity16();
            }
        });
        ib17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity17();
            }
        });
        ib18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity18();
            }
        });
        ib19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity19();
            }
        });
        ib20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity20();
            }
        });
        ib21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity21();
            }
        });
        ib22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity22();
            }
        });
        ib23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity23();
            }
        });
        ib24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity24();
            }
        });
        ib25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity25();
            }
        });
        ib26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity26();
            }
        });
        ib27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity27();
            }
        });
        ib28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity28();
            }
        });
        ib29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity29();
            }
        });
        ib30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity30();
            }
        });
        ib31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity31();
            }
        });
        ib32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity32();
            }
        });
        ib33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity33();
            }
        });
        ib34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity34();
            }
        });
        ib35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity35();
            }
        });
        ib36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity36();
            }
        });
        ib37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity37();
            }
        });
    }
    public void openactivity1(){
        Intent intent=new Intent(this, addastimes.class);
        startActivity(intent);
    }
    public void openactivity2(){
        Intent intent=new Intent(this, aha.class);
        startActivity(intent);
    }
    public void openactivity3(){
        Intent intent=new Intent(this, akonline.class);
        startActivity(intent);
    }
    public void openactivity4(){
        Intent intent=new Intent(this, altbalaji.class);
        startActivity(intent);
    }
    public void openactivity5(){
        Intent intent=new Intent(this, amazonprime.class);
        startActivity(intent);
    }
    public void openactivity6(){
        Intent intent=new Intent(this, arre.class);
        startActivity(intent);
    }
    public void openactivity7(){
        Intent intent=new Intent(this, asianet.class);
        startActivity(intent);
    }
    public void openactivity8(){
        Intent intent=new Intent(this, bigflix.class);
        startActivity(intent);
    }
    public void openactivity9(){
        Intent intent=new Intent(this, bsvalue.class);
        startActivity(intent);
    }
    public void openactivity10(){
        Intent intent=new Intent(this, disneyhotstar.class);
        startActivity(intent);
    }
    public void openactivity11(){
        Intent intent=new Intent(this, doncinema.class);
        startActivity(intent);
    }
    public void openactivity12(){
        Intent intent=new Intent(this, erosnow.class);
        startActivity(intent);
    }
    public void openactivity13(){
        Intent intent=new Intent(this, filmybox.class);
        startActivity(intent);
    }
    public void openactivity14(){
        Intent intent=new Intent(this, hoichoi.class);
        startActivity(intent);
    }
    public void openactivity15(){
        Intent intent=new Intent(this, hungama.class);
        startActivity(intent);
    }
    public void openactivity16(){
        Intent intent=new Intent(this, jiocinema.class);
        startActivity(intent);
    }
    public void openactivity17(){
        Intent intent=new Intent(this, manoramamax.class);
        startActivity(intent);
    }
    public void openactivity18(){
        Intent intent=new Intent(this, mubi.class);
        startActivity(intent);
    }
    public void openactivity19(){
        Intent intent=new Intent(this, mxplayer.class);
        startActivity(intent);
    }
    public void openactivity20(){
        Intent intent=new Intent(this, neestream.class);
        startActivity(intent);
    }
    public void openactivity21(){
        Intent intent=new Intent(this, netflix.class);
        startActivity(intent);
    }
    public void openactivity22(){
        Intent intent=new Intent(this, niri9.class);
        startActivity(intent);
    }
    public void openactivity23(){
        Intent intent=new Intent(this, ollyplus.class);
        startActivity(intent);
    }
    public void openactivity24(){
        Intent intent=new Intent(this, planetmarathi.class);
        startActivity(intent);
    }
    public void openactivity25(){
        Intent intent=new Intent(this, shemaroome.class);
        startActivity(intent);
    }
    public void openactivity26(){
        Intent intent=new Intent(this, sonyliv.class);
        startActivity(intent);
    }
    public void openactivity27(){
        Intent intent=new Intent(this, spuul.class);
        startActivity(intent);
    }
    public void openactivity28(){
        Intent intent=new Intent(this, sunnxt.class);
        startActivity(intent);
    }
    public void openactivity29(){
        Intent intent=new Intent(this, tvfplay.class);
        startActivity(intent);
    }
    public void openactivity30(){
        Intent intent=new Intent(this, ullu.class);
        startActivity(intent);
    }
    public void openactivity31(){
        Intent intent=new Intent(this, viki.class);
        startActivity(intent);
    }
    public void openactivity32(){
        Intent intent=new Intent(this, viu.class);
        startActivity(intent);
    }
    public void openactivity33(){
        Intent intent=new Intent(this, voot.class);
        startActivity(intent);
    }
    public void openactivity34(){
        Intent intent=new Intent(this, vuclip.class);
        startActivity(intent);
    }
    public void openactivity35(){
        Intent intent=new Intent(this, watcho.class);
        startActivity(intent);
    }
    public void openactivity36(){
        Intent intent=new Intent(this, yupptv.class);
        startActivity(intent);
    }
    public void openactivity37(){
        Intent intent=new Intent(this, zee5.class);
        startActivity(intent);
    }










}