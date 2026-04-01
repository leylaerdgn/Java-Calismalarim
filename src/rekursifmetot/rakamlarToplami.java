/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rekursifmetot;

/**
 *
 * @author LEYLA ERDOĞAN
 */
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