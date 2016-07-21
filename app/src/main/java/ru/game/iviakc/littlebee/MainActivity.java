package ru.game.iviakc.littlebee;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    public static final String TAG = "myLogs ";


    Alg alg;

    public static final int countHive=4;

    //Исправить после добовления графики
    //-----
    Button btnInventar,btnShop;

    //------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        alg = new Alg();

        Log.d(TAG, alg.getBinary()+"  Бинарная строка числа  "+String.valueOf(alg.getOsob()));

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
