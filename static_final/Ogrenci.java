
package staticandfinal;

public class Ogrenci {
    String ad;
    int not;
    
    static int ogrenciSayisi=0;
    static final int MAX_NOT=100;
    static final String OKUL_ADİ="Fırat Üniversitesi";
    
    Ogrenci(String ad,int not){
        this.ad=ad;
        this.not=not;
        ogrenciSayisi++;
    }
    
    void bilgileriGoster(){
        System.out.println("Ad: "+ad);
        System.out.println("Not: "+not);
        System.out.println("Okul: "+OKUL_ADİ);
    }
    
    static void ogrenciSayisiniGoster(){
        System.out.println("Toplam öğrenci sayısı: "+ogrenciSayisi);
    }
}
