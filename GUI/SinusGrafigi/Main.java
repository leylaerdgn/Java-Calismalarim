
package gui.SinusGrafigi;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Sinüs Grafiği");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800,600);

        SineWavePanel panel = new SineWavePanel();

        frame.add(panel);

        frame.setVisible(true);
    }

}
