package ru.game.iviakc.littlebee;

import java.util.Random;

/**
 * Created by IVIAKC on 19.07.2016.
 */
public class Alg {
    Random random = new Random();
    private int osob;
    public Alg() {

    }
    protected int getPop(){

        osob = random.nextInt()%127;
        return Math.abs(osob);
    }
}
