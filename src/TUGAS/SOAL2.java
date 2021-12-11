package TUGAS;

import javax.swing.JOptionPane;

public class SOAL2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane
                .showInputDialog(
                        "masukkan angka 1 untuk menyalakan lampu \nmasukkan angka 0 untuk mematikan   lampu"));

        if (n1 == 1) {
            JOptionPane.showMessageDialog(null, "Selamat lampu anda menyala");
        } else if (n1 == 0) {
            JOptionPane.showMessageDialog(null, "maaf lampu anda mati");
        } else {
            JOptionPane.showMessageDialog(null, "Harap memasukkan angka yang benar");
        }
    }
}