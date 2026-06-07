
package rekursifmetot;

public class RecursiveMax {
  public static void main(String[] args) {
    int[] array = {3, 5, 2, 9, 1, 8};
    int max = findMax(array, 0);
    System.out.println("Dizinin en büyük elemanı: " + max);
    }
// Rekürsif olarak dizideki en büyük elemanı bulan metot
public static int findMax(int[] array, int index) {
// Dizinin sonuna gelindiğinde, en büyük değeri Integer.MIN_VALUE (en küçük int değeri) olarak ayarla
    if (index == array.length - 1) {
    return array[index];
    }
// Mevcut elemanı ve bir sonraki elemanın en büyük değerini bul
    int current = array[index];
    int nextMax = findMax(array, index + 1);
// Mevcut elemanın en büyük olup olmadığını kontrol et
    if (current > nextMax) {
    return current;
    } else {
    return nextMax;
    }
     }
}