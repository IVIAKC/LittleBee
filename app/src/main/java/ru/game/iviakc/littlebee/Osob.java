package ru.game.iviakc.littlebee;

import android.util.Log;

import java.util.Random;

/**
 * Created by IVIAKC on 19.07.2016.
 */
public class Osob {
    public static final String TAG = "myLogs";


    private Random random = new Random();
    private int osob;
    public Osob() {
        newOsob();
    }
    public Osob(int os){//Конструктор для рекамбинаторики
        this.osob=os;
    }
    public int getOsob() {
        return osob;
    }
    public void newOsob(){

        this.osob = random.nextInt()%1024;
        this.osob=Math.abs(this.osob);

    }
    public String getBinary(){
        return Integer.toBinaryString(osob);
    }

    public void printSetings(){
        Log.d(TAG, getBinary() + "  Длинна строки  "+ getBinary().length() +"  Бинарная строка числа  " + String.valueOf(getOsob()));
    }
}
