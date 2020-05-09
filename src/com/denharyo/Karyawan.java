package com.denharyo;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Karyawan extends Employs {

    public static Scanner keyboard = new Scanner(System.in);


    public static String getNamaDepan(){
        System.out.println("Please Enter First Name: ");
        String nama1 = keyboard.next();
        return nama1;
    }

    public static String getNamaBelakang(){
        System.out.println("Please Enter Last Name: ");
        String nama2 = keyboard.next();
        return  nama2;
    }

        Karyawan(){
        super.setFirstName(getNamaDepan());
        super.setLastname(getNamaBelakang());
        super.setKTP(12345345);
    }

    public void soundOfKaryawan (){
        System.out.println("Tolong naikkan gaji kami !!!!");
    }

}
