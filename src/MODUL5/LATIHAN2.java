package MODUL5;

import java.util.Scanner;

public class LATIHAN2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        int nilai = inp.nextInt();
        if (nilai >= 0 && nilai <= 55) {
            System.out.println("E");
        } else if (nilai >= 56 && nilai <= 65) {
            System.out.println("D");
        } else if (nilai >= 66 && nilai <= 75) {
            System.out.println("C");
        } else if (nilai >= 76 && nilai <= 85) {
            System.out.println("B");
        } else if (nilai >= 86 && nilai <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Error");
        }
        inp.close();
    }
}
