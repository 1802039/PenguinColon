package org.pltw.examples.penguincolon;

/**
 * Created by karls on 22-Feb-18.
 */

public class Penguin {
    public double breedRate = .25; //Here for future purposes
    public static int minHunt = 2;
    public static int pingus=20;

    public static int getMinHunt() {
        return minHunt;
    }

    public static int getPingus() {
        return pingus;
    }

    public static void setPingus(int pingus) {
        Penguin.pingus = pingus;
    }




}
