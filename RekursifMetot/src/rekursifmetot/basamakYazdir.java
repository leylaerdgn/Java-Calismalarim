
package rekursifmetot;

public class basamakYazdir {

    public static void yazdir(int n) {
        // BASE CASE
        if (n == 0) return;

        // Önce kalan kısmı yazdır
        yazdir(n / 10);
        //yazdir(1234)
           // yazdir(123)
             //   yazdir(12)
               //     yazdir(1)
                 //       yazdir(0)

        // Sonra son rakamı yazdır
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        int sayi = 1234;
        yazdir(sayi);
    }
}
