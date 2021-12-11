package LATIHAN4;

import javax.swing.JOptionPane;

public class SOAL3 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai 2"));
        int n = n1 + n2, n3 = (n1 % 4), h1 = n * n, h2 = n3 * n2;
        boolean b1 = h1 >= h2;
        boolean b2 = h2 >= h1;
        boolean b3 = h1 % 4 == ++h2 % 5;
        boolean b4 = (b1 ^ b3) & (b2 | b3);
        boolean b5 = b2 | (b3 & (b2 ^ b1));

        JOptionPane.showMessageDialog(null, "--------------- SOAL 1 ---------------\n" +
                "h1 ( " + n1 + " + " + n2 + ") * ( " + n2 + " + " + n1 + ")     = " + h1 + "\n" +
                "h2 (" + n1 + " % 4" + " * " + n2 + ")                  = " + --h2 + "\n" +
                "--------------- SOAL 2 ---------------\n" +
                "b1 (" + h1 + " >= " + h2 + ")                          = " + b1 + "\n" +
                "b2 (" + h2 + " >= " + h1 + ")                          = " + b2 + "\n" +
                "b3 (" + h1 + " % 4 == ++" + h2 + " % 5)       = " + b3 + "\n" +
                "b4 (" + b1 + " ^ " + b3 + ") & (" + b2 + " | " + b3 + ")= " + b4 + "\n" +
                "b5 (" + b2 + " | " + b3 + " & " + (b2 ^ b1) + ")             = " + b5);

        /*
         * System.out.println("--------------- SOAL 1 ---------------");
         * System.out.println("h1 ( " + n1 + " + " + n2 + ") * ( " + n2 + " + " + n1 +
         * ") = " + h1);
         * System.out.println("h2 (" + n1 + " % 4" + " * " + n2 + ") = " + --h2);
         */

        /*
         * JOptionPane.showMessageDialog(null,
         * "--------------- SOAL 2 ---------------\n" +
         * "b1 (" + h1 + " >= " + --h2 + ")                   = " + b1 + "\n" +
         * "b2 (" + h2 + " >= " + h1 + ")                   = " + b2 + "\n" +
         * "b3 (" + h1 + " % 4 == ++" + h2 + " % 5)         = " + b3 + "\n" +
         * "b4 (" + b1 + " ^ " + b3 + ") & (" + b2 + " | " + b3 + ")= " + b4 + "\n" +
         * "b5 (" + b2 + " | " + b3 + " & " + (b2 ^ b1) + ")         = " + b5);
         */

        /*
         * System.out.println("--------------- SOAL 2 ---------------");
         * System.out.println("b1 (" + h1 + " >= " + --h2 + ") = " + b1);
         * System.out.println("b2 (" + h2 + " >= " + h1 + ") = " + b2);
         * System.out.println("b3 (" + h1 + " % 4 == ++" + h2 + " % 5) = " + b3);
         * System.out.println("b4 (" + b1 + " ^ " + b3 + ") & (" + b2 + " | " + b3 +
         * ")= " + b4);
         * 
         * System.out.println("b5 (" + b2 + " | " + b3 + " & " + (b2 ^ b1) + ") = " +
         * b5);
         */

    }
}