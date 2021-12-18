package MODUL5;

import java.util.Scanner;

public class LATIHAN4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("masukkan Huruf = ");
        String H = inp.next();
        switch (H) {
            case "A", "a":
                int A = 4, a = 4;
                System.out.println(H + " mempunyai nilai = 4");
                break;
            case "B", "b":
                int B = 3, b = 3;
                System.out.println(H + " mempunyai nilai = 3");
                break;
            case "C", "c":
                int C = 2, c = 2;
                System.out.println(H + " mempunyai nilai = 2");
                break;
            case "D", "d":
                int D = 1, d = 1;
                System.out.println(H + " mempunyai nilai = 1");

                break;
            case "E", "e":
                int E = 0, e = 0;
                System.out.println(H + " mempunyai nilai = 0");

                break;

            default:
                System.out.println(H + "masukkan huruf yang benar");
                break;
        }
        inp.close();
    }
}