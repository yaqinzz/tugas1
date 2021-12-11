package TUGAS;

import javax.swing.JOptionPane;

public class SOAL5 {
    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog("masukkan tanggal lahir");
        JOptionPane.showMessageDialog(null, A.replace("-", " "));

    }
}