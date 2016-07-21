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
    public Alg() {//Первичный конструктор до 8 бит
        this.osob = random.nextInt()%127;
        this.osob=Math.abs(this.osob);
    }
    public Alg(int os){//Конструктор для рекамбинаторики
        this.osob=os;
    }

    public int getOsob() {
        return osob;
    }
    public String getBinary(){
        return Integer.toBinaryString(osob);
    }
}
