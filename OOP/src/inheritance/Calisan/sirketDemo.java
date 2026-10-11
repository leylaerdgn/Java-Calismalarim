
package inheritance.Calisan;

public class sirketDemo {
    public static void main(String[] args) {
        Yazilimci yazilimci1= new Yazilimci("Leyla", "Erdoğan",40000,"Java");
        
        Yonetici yonetici1=new Yonetici("Ahmet", "Yılmaz", 30000, 5);
        
        System.out.println("===Yazılımcı Bilgileri===");
        yazilimci1.yazilimciBilgisiYazdir();
        yazilimci1.calis();
        yazilimci1.kodYaz();
        
        System.out.println();
        
        System.out.println("===Yönetici Bilgileri===");
        yonetici1.yoneticiBilgisiYazdir();
        yonetici1.calis();
        yonetici1.toplantiYap();
    }
}
