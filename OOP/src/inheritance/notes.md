## Inheritance Nedir?
Inheritance, kalıtım demektir.
Bir class’ın başka bir class’tan özellik ve davranış almasıdır.
Kalıtımın temel mantığı mesela elimizde öğrenci, öğretmen, müdür olsun bunların hepsinin
ortak özellikleri var (ad,soyad,yas). Hepsinde ortak davranışlarda olabilir(metot).
Bunları her sınıfta tekrar yazmak yerine ortak bir sınıfa koyarız sonra örneğin öğrenci sınıfı
bu sınıftan kalıtım alır. Yani üst sınıfın değişkenlerini ve metotlarını kullabilir.
extends, “bu sınıf şu sınıftan miras alıyor” demektir.

## Method Overriding Nedir?
Bir child class’ın parent class’taki metodu kendine göre yeniden yazmasına overriding denir.
@Override: Ben üst sınıftaki bir metodu yeniden yazıyorum.

## Kalıtım Şablonu
class UstSinif {
    // ortak özellikler
    // ortak metotlar
}

class AltSinif extends UstSinif {
    // alt sınıfa özel özellikler
    // alt sınıfa özel metotlar
}

## Super() nedir?
Üst sınıf olan Calisan'ın constructor'ını çalıştır.