
package rekursifmetot;

public class rakamlarToplami {

    public static int sumDigits(int n) {
        // BASE CASE (durma şartı)
        if (n == 0) {
            return 0;
        }

        // Son rakam + kalan sayı
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int sayi = 1234;
        System.out.println(sumDigits(sayi));
    }
}