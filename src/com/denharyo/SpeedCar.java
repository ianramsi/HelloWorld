package com.denharyo;

public class SpeedCar {

    //contoh non static Method
    public void FullThrottle (){
        System.out.println("The Fastest Car ALIVE !!!");
    }

    //contoh static Method
    public static void MaxSpeed (Integer maxSpeed){
        System.out.println("Maximum Speed is " + maxSpeed + " kpj");
    }

    public static void main (String [] args){
        //cara panggil non static method itu harus dibuat dulu objectnya
        SpeedCar Car = new SpeedCar();
        Car.FullThrottle();

        //cara panggil static method itu langsung bisa dipanggil tanpa buat object dahulu
        MaxSpeed(150);
    }
}