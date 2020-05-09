package com.denharyo;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Karyawan extends Employs {

    public static Scanner keyboard = new Scanner(System.in);


    public static String getNamaDepan(){
        System.out.println("Please Enter First Name: ");
        return keyboard.next();
    }

    public static String getNamaBelakang(){
        System.out.println("Please Enter Last Name: ");
        return keyboard.next();
    }

        Karyawan(){
        super.setFirstName(getNamaDepan());
        super.setLastname(getNamaBelakang());
        super.setKTP(12345345);
    }

    public void soundOfKaryawan (){

        System.out.println("Tolong naikkan gaji kami !!!!");
    }

    public void soundOfKaryawan2(){

        System.out.println("Yang penting masih kerja dan gajian cuy...bersyukur aja!");
    }

}
