
package inheritance;

public class Yonetici extends Calisan{
    int ekipSayisi;
    
    public Yonetici(String ad, String soyad, double maas, int ekipSayisi){
        super(ad,soyad,maas);
        this.ekipSayisi=ekipSayisi;
    }
    
    public void toplantiYap(){
        System.out.println(ad+ " ekibiyle toplantı yapıyor.");
    }
    
    public void yoneticiBilgisiYazdir(){
        bilgileriYazdir();
        System.out.println("Ekip Sayısı: " +ekipSayisi);
    }
}
