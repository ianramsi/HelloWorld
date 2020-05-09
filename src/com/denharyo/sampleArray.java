package com.denharyo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sampleArray {

    public static void main (String [] args) {

        String dayName[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        for(int i=0; i < dayName.length; i++){
            System.out.println("Hari " + dayName[i]);
        }

        int now = 5;

        System.out.println("now is day "+dayName[now]);

        // sample sort array
        int score [] = {3,59,100,40,55,89,81,99,34};
        Arrays.sort(score);

        for(int i=0; i<score.length; i++) {

            System.out.printf("%d ",score[i]);

        }

        //sample average
        int sum = 0;
        float average;

        for(int a = 0; a<score.length; a++){

            sum = sum + score[a];

        }

        average = (float)sum/score.length;
        System.out.println();
        System.out.println("rata2 "+average);

        // sample ubah array to string
        String stringScore = Arrays.toString(score);

        System.out.println("String Scour "+stringScore);

    }
}
