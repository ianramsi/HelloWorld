package com.denharyo;

public class Moan {


//add new comment to github
    public static void main (String [] args){

        Karyawan karyawan1 = new Karyawan();
        Karyawan karyawan2 = new Karyawan();


        System.out.println("Full Name: " + karyawan1.getFirstName() +" " + karyawan1.getLastName());
        karyawan1.soundOfKaryawan();

        System.out.println("Full Name: " + karyawan2.getFirstName() +" " + karyawan2.getLastName());
        karyawan2.soundOfKaryawan2();

    }
}
