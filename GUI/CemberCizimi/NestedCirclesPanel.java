/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.CemberCizimi;
import javax.swing.*;
import java.awt.*;

class NestedCirclesPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Panelin merkezini bulma
        int width = getWidth();
        int height = getHeight();

        int centerX = width / 2;
        int centerY = height / 2;

        // Çemberlerin başlangıç yarıçapı ve adımı
        int baslangicr = 20;
        int ycapadim = 20;

        // Çemberlerin sayısı
        int numCircles = 10;

        // İç içe çemberleri çizme
        for (int i = 0; i < numCircles; i++) {

            int radius = baslangicr + i * ycapadim;
            int diameter = 2 * radius;

            g.setColor(Color.DARK_GRAY);

            g.drawOval(
                    centerX - radius,
                    centerY - radius,
                    diameter,
                    diameter
            );
        }
    }
}