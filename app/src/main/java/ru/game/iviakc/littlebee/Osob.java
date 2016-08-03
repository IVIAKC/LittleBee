package ru.game.iviakc.littlebee;

import android.util.Log;

/**
 * Created by IVIAKC on 03.08.2016.
 */
public class Osob {
    public static final String TAG = "myLogs ";

    int[] gen;//гены
    int N=2;
    String name ="";

    public Osob(String name) {

        gen = new int[N];
        this.name=name;

    }
    public Osob(String name ,int[] inpGen) {

        gen = new int[N];
        this.name=name;
        setGen(inpGen);
    }


    public int[] getGen() {
        return gen;
    }

    public void setGen(int[] gen) {
        this.gen = gen;
    }

    public Osob reprod(Osob dron){

        int[] tmp;

        tmp=dron.getGen();

        return new Osob("Child",tmp);
    }

    public void consol(){
        Log.d(TAG,name);
        String str="";
        for(int i=0;i<gen.length;i++) {
            str +=Integer.toString(gen[i])+" ";
        }
        Log.d(TAG,str);
    }

    /*

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        System.out.println("Вариантов " + count);
        int shift = max;
        while (count > 0) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            print(arr);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }

     */
}
