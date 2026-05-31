##static Nedir?
Bir bilgi tüm nesneler için ortaksa static yapılır.
Örnek:
class Ogrenci {
    String ad; //her nesneye özeldir.
    static int ogrenciSayisi = 0; //sınıfa aittir. Yani tüm öğrenciler için ortaktır.
}

##static Metot Nedir?
Bir metodun başında static varsa, o metodu çağırmak için nesne oluşturmana gerek yoktur.
Örnek:
class Matematik {

    static int topla(int a, int b) {
        return a + b;
    }
}

Kullanımı:
public class Main {
    public static void main(String[] args) {

        int sonuc = Matematik.topla(5, 3);

        System.out.println(sonuc);
    }
}

##Peki main neden static?
public static void main(String[] args)
Çünkü program ilk çalıştığında Java henüz hiçbir nesne oluşturmamıştır.
Bu yüzden main metodu nesneye bağlı olamaz. Java direkt sınıf üzerinden main metodunu çalıştırır.

##final Nedir?
final, Java’da değeri sonradan değiştirilemez anlamına gelir.