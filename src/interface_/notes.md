## İnterface Nedir?
Interface, bir sınıfa “şu davranışları yapmak zorundasın” diyen bir sözleşmedir.
Yani interface genelde ne yapılacağını söyler, ama çoğu zaman nasıl 
yapılacağını sınıfa bırakır.

## Interface neden kullanılır?
Diyelim ki farklı ödeme türlerin var: Kredi kartı, Nakit, Havale
Hepsi ödeme yapabilir. Ama ödeme yapma şekilleri farklıdır.
Bu yüzden şunu dersin:
Ben bir Odeme interface’i oluşturayım. Bu interface’i kullanan her sınıf odemeYap() metodunu yazmak zorunda olsun.

## İnterface Nasıl Yazılır?
Normal sınıf şöyleydi:
    public class Odeme {
    }

Interface şöyle yazılır:
    public interface Odeme {
    }

İçine metot yazarsın:
    public interface Odeme {
        void odemeYap(double tutar);
    }
Metodun gövdesi yok. Yani { } yok. Çünkü interface sadece şunu der:
Bu metot olmak zorunda. Nasıl çalışacağını ise onu kullanan sınıflar yazar.

## Interface nasıl kullanılır?
Interface’i sınıfa bağlamak için implements kullanılır.