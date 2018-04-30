package com.arg_r.couldthisbelove;

import java.util.Random;

public class LoveCalculator {

    public static void main(String[] args) {

        System.out.println("Your love score is: " + ifYouHadMyLove("Mr X.","Miss Y."));

    }

    public static int ifYouHadMyLove(String yourName, String theirName){

        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        return loveScore;
    }

}
