package ru.game.iviakc.littlebee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;


public class MainActivity extends Activity {
    public static final String TAG = "myLogs ";

    public static final int N=2;

    Osob Dron = new Osob("Dron");
    Osob Prin = new Osob("Prin");
    Osob Child;

    int[] dronGen = new int[N];
    int[] prinGen = new int[N];

    //Исправить после добовления графики
    //-----
    Button btnInventar,btnShop;
    //------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dronGen[0]=0;
        dronGen[1]=0;

        prinGen[0]=0;
        prinGen[1]=1;

        Dron.setGen(dronGen);
        Prin.setGen(prinGen);
/*
        Dron.consol();
        Prin.consol();

        String[] dronStr = {"A","A"};
        String[] prinStr = {"A","a"};


        for(int i=0;i<dronStr.length;i++){

            for(int j=0;j<dronStr.length;j++){
                //Log.d(TAG, dronStr[i]+prinStr[j]);
            }
        }


        Child = Prin.reprod(Dron);
        Child.consol();*/

        Bees f =new Bees("A","a");
        Bees t =new Bees("A","A");

        f.print();
        t.print();
        f.rep(t);
    }

}
