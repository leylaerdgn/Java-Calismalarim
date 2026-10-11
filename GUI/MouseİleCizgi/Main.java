
package gui.MouseİleCizgi;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
       JFrame frame = new JFrame("Mouse ile Çizgi Çizme Uygulaması");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        Cizim panel = new Cizim();
        frame.add(panel);
        frame.setVisible(true);
        }    
}

       
