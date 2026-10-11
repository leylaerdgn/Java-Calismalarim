## Abstraction Nedir?
Abstraction, bir sınıfta “ne yapılacağını” söyleyip, 
“nasıl yapılacağını” alt sınıflara bırakmaktır.

## Abstraction’ın temel mantığı
Şöyle diyorsun:
Ben üst sınıfta odemeYap() diye bir metot olacağını garanti ediyorum.
Ama bu metodun içini burada yazmıyorum.
Alt sınıflar kendi ödeme şekline göre doldursun. Yani üst sınıf bir şablon gibi davranır.

## abstract class Nedir?
abstract class, doğrudan nesnesi oluşturulamayan sınıftır.
Normal sınıf:
    class Odeme {
    }

Abstract sınıf:
    abstract class Odeme {
    }

## Not: Abstract class’tan nesne oluşturulamaz

## abstract method nedir?
Abstract method, gövdesi olmayan metottur.

Normal metot:
    public void odemeYap() {
        System.out.println("Ödeme yapıldı.");
    }

Abstract metot:
    public abstract void odemeYap();
