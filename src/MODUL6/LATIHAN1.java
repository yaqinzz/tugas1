package MODUL6;

public class LATIHAN1 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("\n");
        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
        System.out.println("\n");
        for (int i = 2; i < 20; i += 2) {
            System.out.println(i);
        }
        System.out.println(19);
        System.out.println("");
        int c = 2;

        for (int i = 11; i < 66; i += c++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i += 2) {
            for (int a = -2; a > -11; a -= 2) {
                System.out.println(i + "" + "" + a);

            }

        }
    }
}
