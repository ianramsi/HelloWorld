package com.denharyo;

public class ArrayStuff {

    public static int biggestInt (int[] kampret){
        int suplo = kampret[0];
        for(int i = 1; i < kampret.length; i++){

            if(kampret[i] > suplo){
                suplo = kampret[i];
            }
        }
        return suplo;
    }

    public static int smallInt(int[] kampret){
        int suplo = kampret[];
        // untuk setiap nilai k di dalam array kampret
        for(int k : kampret){
            if(k < suplo) {
                suplo = k;
            }
        }
        return suplo;
    }
}
