package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv1 , tv2;
    ImageView img11, img12, img13, img14, img21, img22,img23,img24,img31, img32,img33,img34;
    Integer[] myCardArray={101,102,103,104,105,106,201,202,203,204,205,206};

    int image101,image102,image103,image104,image105,image106,image201,image202,image203,image204,image205,image206;

    int firstcard, secondcard;
    int clickfirst, clicksecond;
    int turn = 1;
    int cardNumber = 1;
    int playerPoint = 0, cpuPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        img11 = findViewById(R.id.iv11);
        img12 = findViewById(R.id.iv12);
        img13 = findViewById(R.id.iv13);
        img14 = findViewById(R.id.iv14);

        img21 = findViewById(R.id.iv21);
        img22 = findViewById(R.id.iv22);
        img23 = findViewById(R.id.iv23);
        img24 = findViewById(R.id.iv24);

        img31 = findViewById(R.id.iv31);
        img32 = findViewById(R.id.iv32);
        img33 = findViewById(R.id.iv33);
        img34 = findViewById(R.id.iv34);

        img11.setTag("0");
        img12.setTag("1");
        img13.setTag("2");
        img14.setTag("3");

        img21.setTag("4");
        img22.setTag("5");
        img23.setTag("6");
        img24.setTag("7");

        img31.setTag("8");
        img32.setTag("9");
        img33.setTag("10");
        img34.setTag("11");

        frontCardResources();
        Collections.shuffle(Arrays.asList(myCardArray));
        tv2.setTextColor(Color.GRAY);

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img11,thecard);
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img12,thecard);
            }
        });
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img13,thecard);
            }
        });
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img14,thecard);
            }
        });
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img21,thecard);
            }
        });
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img22,thecard);
            }
        });
        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img23,thecard);
            }
        });
        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img24,thecard);
            }
        });
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img31,thecard);
            }
        });
        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img32,thecard);
            }
        });
        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img33,thecard);
            }
        });
        img34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(img34,thecard);
            }
        });

    }
    public void frontCardResources()
    {
        image101 = R.drawable.card_1;
        image102 = R.drawable.card_2;
        image103 = R.drawable.card_3;
        image104 = R.drawable.card_4;
        image105 = R.drawable.card_5;
        image106 = R.drawable.card_6;

        image201 = R.drawable.card_1;
        image202 = R.drawable.card_2;
        image203 = R.drawable.card_3;
        image204 = R.drawable.card_4;
        image205 = R.drawable.card_5;
        image206 = R.drawable.card_6;
    }
    private void doStuff(ImageView iv, int card)
    {
        if(myCardArray[card] == 101)
        {
            iv.setImageResource(image101);
        }
        else if(myCardArray[card] == 102)
        {
            iv.setImageResource(image102);
        }
        else if(myCardArray[card] == 103)
        {
            iv.setImageResource(image103);
        }
        else if(myCardArray[card] == 104)
        {
            iv.setImageResource(image104);
        }
        else if(myCardArray[card] == 105)
        {
            iv.setImageResource(image105);
        }
        else if(myCardArray[card] == 106)
        {
            iv.setImageResource(image106);
        }
        else if(myCardArray[card] == 201)
        {
            iv.setImageResource(image201);
        }
        else if(myCardArray[card] == 202)
        {
            iv.setImageResource(image202);
        }
        else if(myCardArray[card] == 203)
        {
            iv.setImageResource(image203);
        }
        else if(myCardArray[card] == 204)
        {
            iv.setImageResource(image204);
        }
        else if(myCardArray[card] == 205)
        {
            iv.setImageResource(image205);
        }
        else if(myCardArray[card] == 206)
        {
            iv.setImageResource(image206);
        }

        if(cardNumber == 1)
        {
            firstcard = myCardArray[card];
            if(firstcard > 200)
            {
                firstcard = firstcard - 100;
            }
            cardNumber = 2;
            clickfirst = card;

            iv.setEnabled(false);
        }
        else if(cardNumber == 2)
        {
            secondcard = myCardArray[card];
            if(secondcard > 200)
            {
                secondcard = secondcard - 100;
            }
            cardNumber = 1;
            clicksecond = card;

            img11.setEnabled(false);
            img12.setEnabled(false);
            img13.setEnabled(false);
            img14.setEnabled(false);

            img21.setEnabled(false);
            img22.setEnabled(false);
            img23.setEnabled(false);
            img24.setEnabled(false);

            img31.setEnabled(false);
            img32.setEnabled(false);
            img33.setEnabled(false);
            img34.setEnabled(false);
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    private void calculate()
    {
        if(firstcard == secondcard)
        {
            if(clickfirst == 0)
            {
                img11.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 1)
            {
                img12.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 2)
            {
                img13.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 3)
            {
                img14.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 4)
            {
                img21.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 5)
            {
                img22.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 6)
            {
                img23.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 7)
            {
                img24.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 8)
            {
                img31.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 9)
            {
                img32.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 10)
            {
                img33.setVisibility(View.INVISIBLE);
            }
            else if(clickfirst == 11)
            {
                img34.setVisibility(View.INVISIBLE);
            }


            if(clicksecond == 0)
            {
                img11.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 1)
            {
                img12.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 2)
            {
                img13.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 3)
            {
                img14.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 4)
            {
                img21.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 5)
            {
                img22.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 6)
            {
                img23.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 7)
            {
                img24.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 8)
            {
                img31.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 9)
            {
                img32.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 10)
            {
                img33.setVisibility(View.INVISIBLE);
            }
            else if(clicksecond == 11)
            {
                img34.setVisibility(View.INVISIBLE);
            }


            if(turn == 1)
            {
                playerPoint++;
                tv1.setText("Player1: " + playerPoint);
            }
            else if(turn == 2)
            {
                cpuPoints++;
                tv2.setText("Player2: " + cpuPoints);
            }
        }
        else
        {
            img11.setImageResource(R.drawable.bgcard);
            img12.setImageResource(R.drawable.bgcard);
            img13.setImageResource(R.drawable.bgcard);
            img14.setImageResource(R.drawable.bgcard);

            img21.setImageResource(R.drawable.bgcard);
            img22.setImageResource(R.drawable.bgcard);
            img23.setImageResource(R.drawable.bgcard);
            img24.setImageResource(R.drawable.bgcard);

            img31.setImageResource(R.drawable.bgcard);
            img32.setImageResource(R.drawable.bgcard);
            img33.setImageResource(R.drawable.bgcard);
            img34.setImageResource(R.drawable.bgcard);

            if(turn == 1)
            {
               turn = 2;
                tv1.setTextColor(Color.GRAY);
                tv2.setTextColor(Color.BLACK);
            }
            else if(turn == 2)
            {
               turn = 1;
                tv2.setTextColor(Color.GRAY);
                tv1.setTextColor(Color.BLACK);
            }
        }
        img11.setEnabled(true);
        img12.setEnabled(true);
        img13.setEnabled(true);
        img14.setEnabled(true);

        img21.setEnabled(true);
        img22.setEnabled(true);
        img23.setEnabled(true);
        img24.setEnabled(true);

        img31.setEnabled(true);
        img32.setEnabled(true);
        img33.setEnabled(true);
        img34.setEnabled(true);

        checkend();


    }
    private void checkend()
    {
        if(img11.getVisibility() == View.INVISIBLE && img12.getVisibility() == View.INVISIBLE &&
                img13.getVisibility() == View.INVISIBLE &&img14.getVisibility() == View.INVISIBLE &&
                img21.getVisibility() == View.INVISIBLE &&img22.getVisibility() == View.INVISIBLE &&
                img23.getVisibility() == View.INVISIBLE &&img24.getVisibility() == View.INVISIBLE &&
                img31.getVisibility() == View.INVISIBLE &&img32.getVisibility() == View.INVISIBLE &&
                img33.getVisibility() == View.INVISIBLE &&img34.getVisibility() == View.INVISIBLE )
        {
            AlertDialog.Builder alternativebuilder = new AlertDialog.Builder(MainActivity.this);
            alternativebuilder.setMessage("Game Over \nPlayer1:" + playerPoint + " \nPlayer2: " + cpuPoints);
            alternativebuilder.setCancelable(false);
            alternativebuilder.setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    finish();
                }
            }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            AlertDialog alertDialog = alternativebuilder.create();
            alertDialog.show();

        }
    }

}