package ru.game.iviakc.littlebee;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    public static final String TAG = "myLogs";
    int osob;

    Alg alg;

    public static final int countHive=4;

    //Исправить после добовления графики
    //-----
    Button btnInventar,btnShop,btnHive[];

    //------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Исправить после добавления графики
        //---

        btnInventar= (Button) findViewById(R.id.btn_inventar);
        btnShop = (Button) findViewById(R.id.btn_shop);
        /*Разобраться как работать с R
        for(int i =0;i<countHive;i++){
            btnHive[i] = (Button) findViewById();
        }*/
        //---
        alg = new Alg();
        Log.d(TAG, String.valueOf(osob));
        Log.d(TAG, String.valueOf(Integer.toBinaryString(osob)));
        initListener();
    }
    private void initListener(){
        btnInventar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InventarActivity.class);
                startActivity(intent);
            }
        });

        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(intent);
            }
        });
    }
}
