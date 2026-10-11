
package rekursifmetot;
public class BinaryRepresentation {
public static void main(String[] args) {
    int number = 25;
    String binary = binaryRepresentation(number);
    System.out.println("Sayının ikili taban karşılığı: " + binary);
    }
// Rekürsif olarak sayının ikili taban karşılığını bulan metot
public static String binaryRepresentation(int number) {
// Taban durum: Sayı 0 veya 1 ise, kendisini string olarak döndür
    if (number == 0 || number == 1) {
    return Integer.toString(number);
    }
// Sayının son basamağını al ve geri kalan kısmın ikili taban karşılığını rekürsif olarak hesapla
    int lastDigit = number % 2;
    String restOfTheNumber = binaryRepresentation(number / 2);
    // Son basamak ile geri kalan kısmı birleştirerek sonucu döndür
    return restOfTheNumber + lastDigit;
    }
  }