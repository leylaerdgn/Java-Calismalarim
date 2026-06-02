//Basit sayaç uygulaması

package gui;
import javax.swing.*;
import java.awt.FlowLayout;

public class CounterApp extends JFrame{
    int count=0;
    JLabel countLabel; //Ekranda sayıyı gösterecek label değişkenini tanımladık.
    JButton increaseButton;
    
    public CounterApp(){
        setTitle("Sayaç Uygulaması");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Bunu yazmazsak pencere kapanabilir ama program arka planda çalışmaya devam edebilir.
        setLayout(new FlowLayout()); //Pencerenin içindeki elemanların nasıl dizileceğini belirler. FlowLayout, elemanları sırayla yan yana dizer.
        
     
        countLabel=new JLabel("Sayı: 0"); //Burada gerçekten label nesnesini oluşturduk. Ekranda başlangıçta 0 yazacak.
        increaseButton = new JButton("Artır");
        increaseButton.addActionListener(e -> {//Bu satır butona tıklanınca ne olacağını belirler.
            count++;
            countLabel.setText("Sayı: "+count); //Label’ın üzerindeki yazıyı günceller.
        });
        
        add(countLabel); //Label’ı pencereye ekler.
        add(increaseButton); //Butonu pencereye ekler.
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new CounterApp();
    }
}
