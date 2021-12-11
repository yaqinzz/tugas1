package TUGAS;

import javax.swing.JOptionPane;

public class SOAL4 {
    public static void main(String[] args) {

        String A = JOptionPane.showInputDialog("Masukkan salah satu huruf dari Alphabet");
        char b = A.charAt(0);

        if (b == 'a' || b == 'A' || b == 'i' || b == 'I' || b == 'u' || b == 'U' ||
                b == 'e' || b == 'E' || b == 'o' || b == 'O') {
            JOptionPane.showMessageDialog(null, A + " adalah huruf vokal.");
        } else {
            JOptionPane.showMessageDialog(null, A + " adalah huruf konsonan.");
        }

    }
}
