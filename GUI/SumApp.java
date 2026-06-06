
package gui;
import javax.swing.*;
import java.awt.GridLayout; //GridLayout, pencereye eklenen elemanları satır ve sütun düzeninde yerleştirir.
//AWT, Java’nın eski grafik arayüz kütüphanesidir. Yani pencere, buton, label, layout gibi arayüz elemanlarının temelini sağlayan eski Java GUI sistemidir.

public class SumApp extends JFrame {
    //extends JFrame dediğimiz için SumApp, artık bir pencere gibi davranabilir.
    //Yani bu sınıfın içinde direkt şunları yazabiliyoruz:

    JTextField number1Field;
    JTextField number2Field;
    JButton sumButton;
    JLabel resultLabel;

    public SumApp() { //Pencere ayarları, text field’lar, butonlar burada oluşturulur.
        setTitle("Toplama Uygulaması");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("1. Sayı:"));
        number1Field = new JTextField();
        add(number1Field);

        add(new JLabel("2. Sayı:"));
        number2Field = new JTextField();
        add(number2Field);

        sumButton = new JButton("Topla");
        add(sumButton);

        resultLabel = new JLabel("Sonuç:");
        add(resultLabel);

        
        //sumButton butonuna basılırsa aşağıdaki kodları çalıştır.
        //Buradaki e, gerçekleşen olayı temsil eder. (butona basma olayı.)
        sumButton.addActionListener(e -> { 
            try {
                int number1 = Integer.parseInt(number1Field.getText()); //number1Field.getText() birinci kutudaki yazıyı alır.
                int number2 = Integer.parseInt(number2Field.getText());

                int result = number1 + number2;

                resultLabel.setText("Sonuç: " + result); //resultLabel üzerinde görünen yazıyı değiştir.

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Lütfen geçerli sayı giriniz."); //Java GUI’de küçük mesaj penceresi göstermek için kullanılır.
            }
        }); //addActionListener bloğu burada biter. Yani butona basılınca çalışacak kodlar burada tamamlanır.

        setVisible(true);
    }

    public static void main(String[] args) {
        new SumApp();
    }
}