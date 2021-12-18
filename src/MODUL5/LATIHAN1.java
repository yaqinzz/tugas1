package MODUL5;

import java.util.Scanner;

public class LATIHAN1 {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        // Ambil Nama
        System.out.print("Masukkan nama anda = ");
        String Nama = inp.nextLine();
        // Ambil NIM
        System.out.print("Masukkan NIM = ");
        String nim = inp.next();
        // Ambil Nilai
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        System.out.println("Masukkan Nama anda = " + Nama);
        System.out.println("masukkan NIM = " + nim);
        System.out.println("Masukkan Nilai = " + nilai);
        if (nilai >= 55) {
            System.out.println("Selamat anda lulus.");
        } else {
            System.out.println("Anda tidak lulus.");
        }
        inp.close();

    }
}