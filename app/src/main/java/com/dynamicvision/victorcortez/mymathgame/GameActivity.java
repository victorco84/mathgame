package com.dynamicvision.victorcortez.mymathgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class GameActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int     a = 10;
        String  b = "Alan Turing";
        boolean c = false;

        Log.i("info","info a=" + a);
        Log.i("info","info b=" + b);
        Log.i("info","info c=" + c);

        a++;
        a = a + 10;
        b = b + " was smarter than the average bear Booboo";
        b = b + a;
        c = (1 + 1 == 3);//1 + 1 is definitely 2! So false.


        Log.i("info","info a=" + a);
        Log.i("info","info b=" + b);
        Log.i("info","info c=" + c);


    }


}
