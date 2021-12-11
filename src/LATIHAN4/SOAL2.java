package LATIHAN4;

import java.util.Scanner;

public class SOAL2 {
    public static void main(String[] args) {
        // BUAT Scanner
        Scanner Hitung = new Scanner(System.in);

        // Ambil nilai dari keyboard
        System.out.print("nilai 1 = ");
        double nilai1 = Hitung.nextInt();

        System.out.print("nilai 2 = ");
        double nilai2 = Hitung.nextInt();
        double hasil = nilai1 + nilai2;
        System.out.println("nilai 1 + nilai 2 = " + hasil);

        Hitung.close();
    }
}