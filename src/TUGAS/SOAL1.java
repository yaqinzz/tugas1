package TUGAS;

import javax.swing.JOptionPane;

public class SOAL1 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka 2"));
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "angka " + n1 + " adalah angka terbesar");
        } else {
            JOptionPane.showMessageDialog(null, "angka " + n2 + " adalah angka terbesar");
        }
    }
}