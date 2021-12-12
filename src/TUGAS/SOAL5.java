package TUGAS;

import javax.swing.JOptionPane;

public class SOAL5 {
    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog("masukkan tanggal lahir");
        String B = A.replace("-", " ");
        JOptionPane.showMessageDialog(null, B.replaceAll("10", "oktober"));

    }
}