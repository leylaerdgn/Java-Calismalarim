
package gui.CizimPanel;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
         JFrame frame = new JFrame("Temel Grafik Çizimleri");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kullanıcı X tuşuna basınca program tamamen kapansın.
        frame.setSize(800, 600);

        CizimPanel panel = new CizimPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}