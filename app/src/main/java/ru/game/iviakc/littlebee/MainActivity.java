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

    String Astr,Bstr;
    Osob A,B;

    //Исправить после добовления графики
    //-----
    Button btnInventar,btnShop;
    //------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A=new Osob();
        B=new Osob();

        A.printSetings();

        B.printSetings();


        Astr=A.getBinary();  Bstr=B.getBinary();
        if(Astr.length()!=Bstr.length()){//условия приравнивания
            int num=Astr.length()-Bstr.length();

            String str0="";
            Log.e(TAG,"num = "+num);
            if(num<0) {
                num =Math.abs(num);
                for(int i=0;i<num;i++)
                    str0=str0.concat("0");
                Astr=str0.concat(Astr);
                Log.e(TAG,"Astr = "+Astr);
            }else{
                for(int i=0;i<num;i++)
                    Bstr = Bstr.concat("0");
                Log.e(TAG,"Bstr = "+Bstr);
            }




        }
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
