package com.denharyo;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public  static Scanner keyboard = new Scanner(System.in);

    public static int getPinjaman (){
        int pinjaman = keyboard.nextInt();
        return pinjaman;
    }

    public static int getPeriod(){
        int period = keyboard.nextInt();
        return period;

    }

    public static float getInterest(){
        float interest = keyboard.nextFloat();
        return interest;
    }


    public static void main (String [] args){
        final int Months_In_Year = 12;
        final int Percent = 100;

        System.out.print("Masukkan Pinjaman: ");
        int pinjam = getPinjaman();

        System.out.print("Masukkan Bunga pertahun ( persen ): ");
        float bungaTahunan = getInterest();
        float bungaBulanan = bungaTahunan / Percent / Months_In_Year;

        System.out.println("Periode Peminjaman dalam tahun: ");
        int tahun = getPeriod();
        int jumlahPembayaran = tahun * Months_In_Year;

        double hutang = pinjam * (bungaBulanan * Math.pow(1 + bungaBulanan, jumlahPembayaran) )/ (Math.pow(1 + bungaBulanan, jumlahPembayaran)-1);


        String hutangFormatted = NumberFormat.getCurrencyInstance().format(hutang);

        System.out.println ("Hutang: " + hutangFormatted);

        keyboard.close();

    }
}
