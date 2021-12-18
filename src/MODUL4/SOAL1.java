package MODUL4;

import java.util.Scanner;

public class SOAL1 {
    public static void main(String[] args) {
        // BUAT Scanner
        Scanner Inputan_saya = new Scanner(System.in);
        // Ambil nilai dari keyboard

        System.out.print("Nama  = ");
        String Nama = Inputan_saya.nextLine();

        System.out.print("NIM   = ");
        int NIM = Inputan_saya.nextInt();

        System.out.print("TTL   = ");
        String TTL = Inputan_saya.next();

        System.out.print("ALAMAT= ");
        String Alamat = Inputan_saya.next();

        System.out.print("EMAIL =");
        String Email = Inputan_saya.next();
        System.out.println("\n\n\n\n");

        System.out.println("~~~~~~~~~BIODATA~~~~~~~~~");
        System.out.println("NAMA   = " + Nama);
        System.out.println("NIM    = " + NIM);
        System.out.println("TTL    = " + TTL);
        System.out.println("ALAMAT = " + Alamat);
        System.out.println("EMAIL  = " + Email);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Inputan_saya.close();

    }
}