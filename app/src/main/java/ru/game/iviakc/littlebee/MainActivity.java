package ru.game.iviakc.littlebee;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;


public class MainActivity extends Activity {
    public static final String TAG = "myLogs";
    int osob=0;
    boolean flag=true;
    Alg alg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alg = new Alg();
        Log.d(TAG, String.valueOf(osob));
        Log.d(TAG, String.valueOf(Integer.toBinaryString(osob)));

    }
}
