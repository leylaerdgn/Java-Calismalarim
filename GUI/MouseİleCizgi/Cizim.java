
package gui.MouseİleCizgi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Cizim extends JPanel implements MouseListener {

    int indis = 0;

    private int[][] points = new int[2][100];

    public Cizim() {
        addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {

        points[0][indis] = e.getX();
        points[1][indis] = e.getY();

        indis++;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.BLUE);

        for (int i = 1; i < indis; i++) {

            int p1x = points[0][i - 1];
            int p1y = points[1][i - 1];

            int p2x = points[0][i];
            int p2y = points[1][i];

            g.drawLine(p1x,p1y,p2x,p2y);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
