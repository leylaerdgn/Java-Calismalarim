
package abstraction.Calisan;
public class CalisanDemo {

    public static void main(String[] args) {
        
        Calisan calisan1=new TamZamanliCalisan("Leyla", 40000);
        Calisan calisan2 = new SaatlikCalisan("Ahmet", 120, 250);
        
        
        calisan1.bilgiYazdir();
        System.out.println("Maaş: " +calisan1.maasHesapla());
        
        System.out.println("------------------");
        
        calisan2.bilgiYazdir();
        System.out.println("Maaş: " +calisan2.maasHesapla());
    }
}
