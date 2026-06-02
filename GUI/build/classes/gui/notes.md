##Java GUI nedir?
Graphical User Interface, yani grafiksel kullanıcı arayüzü.

##Java’da GUI için ne kullanılır?
Java’da GUI için birkaç teknoloji var:
Teknoloji	Açıklama
AWT	Eski GUI kütüphanesi
Swing	Temel ve yaygın GUI kütüphanesi
JavaFX	Daha modern GUI kütüphanesi

##Swing’de en temel yapı: JFrame
JFrame, pencere demektir.
Yani GUI uygulamasının ana ekranıdır.

##JLabel nedir?
Ekrana yazı yazdırmak için kullanılır.

##JButton nedir?
JButton, buton oluşturmak için kullanılır.

##Event nedir?
Event, kullanıcının yaptığı işlemdir.

Kullanıcı hareketi	Event
Butona tıklama   	click event
Yazı yazma	        input event
Seçim yapma     	selection event

Java’da butona tıklanınca çalışacak kodu yazmak için ActionListener kullanırız.

button.addActionListener(e -> {
    System.out.println("Butona tıklandı.");
});
Bu şu demektir: Bu butona tıklanınca içerideki kodları çalıştır.

##JTextField nedir?
JTextField, kullanıcıdan tek satırlık veri almak için kullanılır.

##JPanel nedir?
JPanel, bileşenleri düzenli koymak için kullanılan bir paneldir.
JFrame ana pencere, JPanel ise pencerenin içindeki alan.

##JTextArea nedir?
JTextArea, çok satırlı metin alanıdır. Listeleme yapmak için kullanışlıdır.

##JOptionPane nedir?
JOptionPane, küçük uyarı mesajı göstermek için kullanılır.
JOptionPane.showMessageDialog(null, "Bir hata oluştu!");

##Layout nedir?
Layout, GUI elemanlarının pencereye nasıl yerleşeceğini belirler.
Mesela:
Label solda mı olsun?
Buton altta mı olsun?
TextField yan yana mı olsun?

| Layout       | Açıklama                                                                |
| ------------ | ----------------------------------------------------------------------- |
| FlowLayout   | Elemanları yan yana dizer                                               |
| BorderLayout | Kuzey, güney, doğu, batı, merkez şeklinde yerleştirir                   |
| GridLayout   | Elemanları tablo gibi satır-sütun yapar                                 |
| BoxLayout    | Elemanları dikey veya yatay dizer                                       |
| null layout  | Elle konum verilir, başlangıçta kolaydır ama büyük projelerde önerilmez |

##GUI’de sınıf yapısı nasıl olmalı?
Küçük örneklerde her şeyi main içine yazabiliriz.
Ama düzgün kullanımda ayrı bir sınıf oluşturmak daha iyidir.
Mesela:
public class MyFrame extends JFrame {
    
}

Bu şu demektir: MyFrame sınıfı bir JFrame’dir.