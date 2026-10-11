
package gui.BuyuyupKuculenCember;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
JFrame frame = new JFrame("Büyüyüp Küçülen Çember");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(600, 600);
     AnimatedCirclePanel panel = new AnimatedCirclePanel();
     frame.add(panel);
     frame.setVisible(true);    }

    }
