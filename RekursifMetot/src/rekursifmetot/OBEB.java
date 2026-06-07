
package rekursifmetot;
public class OBEB {

    public static void main(String[] args) {
            int sayi1 = 24;
            int sayi2 = 18;
            int obeb = findOBEB(sayi1, sayi2);
            System.out.println("Girilen sayıların OBEB'i: " + obeb);
            }
            // Rekürsif olarak OBEB'i bulan metod
    public static int findOBEB(int sayi1, int sayi2) {
            if (sayi2 == 0) {
            return sayi1;
            } else {
            return findOBEB(sayi2, sayi1 % sayi2);
            }
            }
}
   
    
