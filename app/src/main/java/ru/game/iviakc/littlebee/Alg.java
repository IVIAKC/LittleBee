package ru.game.iviakc.littlebee;

import android.util.Log;

import java.util.Random;

/**
 * Created by IVIAKC on 19.07.2016.
 */
public class Alg {
    public static final String TAG = "myLogs";

    private Random random = new Random();
    private int osob;
    public Alg() {
        this.osob = random.nextInt()%127;
        this.osob=Math.abs(this.osob);
    }

    public int getOsob() {
        return osob;
    }

    public void setOsob(int osob) {
        this.osob = osob;
    }

    public void getByte(){
        byte byt[];
        Integer.
        Log.d(TAG, String.valueOf(Integer.bitCount(osob)));
    }

    public Alg recom(Alg A){

        return this;
    }
}
