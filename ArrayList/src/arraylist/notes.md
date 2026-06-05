## ArrayList nedir?
Boyutu sonradan değişebilen listedir.
Normal array yani dizi oluşturduğunda boyutu sabittir:
    int[] sayilar = new int[5];
Java’da ArrayList, java.util paketinde bulunur. Kullanmak için en üste 
şunu yazarız: import java.util.ArrayList;

ArrayList’in temel amacı:
ArrayList<String> isimler = new ArrayList<>();
Burada: ArrayList<String> String türünde elemanlar tutan bir liste demek.
isimler listenin adı.
new ArrayList<>() bellekte yeni bir ArrayList oluşturur.

## ArrayList neden kullanılır?
Normal array’de şunu yapmak zor: String[] isimler = new String[3];
3 kişilik yer açtın. Sonra 4. kişiyi eklemek istersen sorun olur.
Ama ArrayList’te:

ArrayList<String> isimler = new ArrayList<>();
isimler.add("Leyla");
isimler.add("Dicle");
isimler.add("ayşe");
isimler.add("Zeynep");

Hiç sorun olmaz. Liste büyür.

## ArrayList oluşturma
String ArrayList
ArrayList<String> isimler = new ArrayList<>();

Integer ArrayList
ArrayList<Integer> sayilar = new ArrayList<>();

## ArrayList’e eleman ekleme
ArrayList<String> urunler = new ArrayList<>();
urunler.add("Laptop");
urunler.add("Telefon");
urunler.add("Tablet");

Liste artık şöyle olur:
[Laptop, Telefon, Tablet]

Ekrana yazdırmak için:
System.out.println(urunler);

## Belirli sıraya eleman ekleme
urunler.add(1, "Mouse");

## Eleman okuma: get()
System.out.println(urunler.get(0));

## Eleman değiştirme: set()
urunler.set(2, "Klavye");

## Eleman silme: remove()
urunler.remove(1);

## Liste boyutu: size()
Normal array’de: dizi.length

ArrayList’te: urunler.size()

## Liste boş mu kontrol etme: isEmpty()
if (urunler.isEmpty()) {
    System.out.println("Liste boş.");
} else {
    System.out.println("Liste dolu.");
}