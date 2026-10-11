
package gui.CemberCizimi;

import javax.swing.JFrame;

public class Main {
     
    public static void main(String[] args) {
        JFrame frame = new JFrame("İç İçe Çemberler Çizimi");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800, 600);

        NestedCirclesPanel panel = new NestedCirclesPanel();

        frame.add(panel);

        frame.setVisible(true);
    }}