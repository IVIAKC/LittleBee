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

    public static final int N=8;

    Osob Dron = new Osob();
    Osob Prin = new Osob();

    String[] dronGen = new String[N];
    String[] prinGen = new String[N];

    //Исправить после добовления графики
    //-----
    Button btnInventar,btnShop;
    //------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dronGen[0]="1";
        dronGen[1]="2";
        dronGen[2]="3";
        dronGen[3]="4";
        dronGen[4]="5";
        dronGen[5]="6";
        dronGen[6]="7";
        dronGen[7]="8";

        prinGen[0]="A";
        prinGen[1]="A";
        prinGen[2]="B";
        prinGen[3]="B";
        prinGen[4]="C";
        prinGen[5]="C";
        prinGen[6]="D";
        prinGen[7]="D";

        Dron.setGen(dronGen);
        Prin.setGen(prinGen);

        print();
        Dron.repr();

     }

    public void print(){
        String dronActiv="";

        String prinActiv="";

        for(int i=0;i<N;i++) {
            if(i%2==0) {
                dronActiv += " " + Dron.getGen()[i];
                prinActiv += " " + Prin.getGen()[i];
            }else {
                dronActiv +=Dron.getGen()[i];
                prinActiv +=Prin.getGen()[i];
            }

        }
        Log.d(TAG + "dronGen", dronActiv);
        Log.d(TAG + "prinGen", prinActiv);
        Log.d(TAG," ");

    }


}
