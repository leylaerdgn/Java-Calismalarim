
package gui.SinusGrafigi;
import javax.swing.*;
import java.awt.*;

class SineWavePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int amplitude = 100;
        int frequency = 5;

        int[] xn = new int[width];
        int[] yn = new int[width];

        for (int i = 0; i < width; i++) {

            double y = height / 2 +
                    amplitude *
                    Math.sin(
                            (2 * Math.PI * frequency * i)
                                    / width
                    );

            xn[i] = i;
            yn[i] = (int) y;
        }

        g.setColor(Color.BLUE);

        g.drawPolyline(xn, yn, width);
    }
}
