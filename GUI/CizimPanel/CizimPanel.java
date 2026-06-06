/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.CizimPanel;

import javax.swing.*;//GUI bileşenleri için.
import java.awt.*; // çizim araçları için. (Graphics, color, font)

public class CizimPanel extends JPanel { // Kendi çizim panelimi oluşturacağım.

    @Override // Bu yazılmasa da olur.Peki neden yazılıyor? Bu üst sınıftaki paintComponent metodunu ezer. Jpanel zaten paintComponente sahip. Biz kendi sürümümüzü yazıyoruz.
    protected void paintComponent(Graphics g2d) { //Java'nın çizim motoru bu metodu çağırır.
        super.paintComponent(g2d);// Paneli temizliyor.

        // Kırmızı dikdörtgen
        g2d.setColor(Color.RED); //kalemi kırmızı yap.
        g2d.fillRect(50, 50, 100, 100); // fillRect(x, y, genislik, yukseklik) burada içi dolu kırmızı dikdörtgen çizilir.

        // Yeşil daire
        g2d.setColor(Color.GREEN);
        g2d.fillOval(200, 50, 100, 100);

        // Mavi çizgi
        g2d.setColor(Color.BLUE);
        g2d.drawLine(50, 200, 150, 300);

        // Siyah yazı
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Temel Çizimler", 50, 350);

        // Mor yuvarlak köşeli dikdörtgen
        g2d.setColor(Color.MAGENTA);
        g2d.drawRoundRect(200, 200, 150, 100, 20, 20);

        // Turuncu yay
        g2d.setColor(Color.ORANGE);
        g2d.drawArc(400, 50, 100, 100, 0, 180);
    }
}


   