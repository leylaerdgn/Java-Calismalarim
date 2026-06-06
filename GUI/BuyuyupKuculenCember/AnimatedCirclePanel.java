
package gui.BuyuyupKuculenCember;
import javax.swing.*;
import java.awt.*;

public class AnimatedCirclePanel extends JPanel implements
Runnable {
 private int radius = 5; // Başlangıç yarıçapı
 private boolean growing = true; // Çemberin büyüyüp büyümeyeceği durumu
private final int maxRadius = 300; // Maksimum yarıçap
 private final int minRadius = 5; // Minimum yarıçap
 private final int step = 5; // Büyüme/Küçülme adımı
 public AnimatedCirclePanel() {
 // Yeni bir Thread başlat
 Thread animator = new Thread(this);
 animator.start();
 }
 @Override
 protected void paintComponent(Graphics g) {
 super.paintComponent(g);
 int width = getWidth();
 int height = getHeight();
 int centerX = width / 2;
 int centerY = height / 2;
 g.setColor(Color.BLUE);
 g.fillOval(centerX - radius, centerY - radius, 2 *
radius, 2 * radius);
 }
 @Override
 public void run() {
 while (true) {
 if (growing) {
 radius += step;
 if (radius >= maxRadius) {
 growing = false;
 }
 } else {
 radius -= step;
 if (radius <= minRadius) {
 growing = true;
 }
 }
 repaint();
 try {
 Thread.sleep(100); // Animasyon hızını ayarlamak için bekleme süresi
 } catch (InterruptedException e) {
e.printStackTrace();
 }
 }
}
}

