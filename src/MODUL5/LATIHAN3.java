package MODUL5;

import java.util.Scanner;

public class LATIHAN3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("masukkan jenis kelamin = ");
        String JK = inp.next();
        System.out.print("masukkan Tinggi Badan = ");
        int TB = inp.nextInt();

        if (JK.equals("Laki-Laki")) {
            if (TB >= 0 && TB <= 170) {
                System.out.println("Anda Gagal");
            } else if (TB >= 171 && TB <= 230) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("maaf anda terlalu tinggi");
            }

        } else if (JK.equals("Perempuan")) {
            if (TB >= 0 && TB <= 60) {
                System.out.println("Anda Gagal");
            } else if (TB >= 161 && TB <= 210) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("maaf anda terlalu tinggi");
            }
        }
        inp.close();
    }

}
