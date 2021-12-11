package TUGAS;

import javax.swing.JOptionPane;

public class SOAL3 {
    public static void main(String[] args) {
        double T = Double.parseDouble(JOptionPane.showInputDialog("masukkan tinggi air"));
        if (T <= 500.0) {
            JOptionPane.showMessageDialog(null, "status AMAN");
        } else if (T <= 600.0) {
            JOptionPane.showMessageDialog(null, "status WASPADA");
        } else if (T <= 650.0) {
            JOptionPane.showMessageDialog(null, "status SIAGA 2");
        } else {
            JOptionPane.showMessageDialog(null, "status SIAGA1");
        }
    }
}