package ru.game.iviakc.littlebee;

import android.util.Log;

import java.util.Random;

/**
 * Created by IVIAKC on 03.08.2016.
 */
public class Bees {
    public static final String TAG = "myLogs ";
    String[] activ=new String[2];
    Random random = new Random();

    public Bees(String a,String p) {

        activ[0]=a;
        activ[1]=p;


    }

    public void print(){
        Log.d(TAG,activ[0]+activ[1]);
    }

    public void rep(Bees osob){



        while(true)
            Log.d(TAG,activ[Math.abs((random.nextInt() % 2))]+ osob.activ[Math.abs((random.nextInt() % 2))]) ;


    }

}
