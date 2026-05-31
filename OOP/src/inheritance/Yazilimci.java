
package inheritance;

public class Yazilimci extends Calisan{
    String programlamaDili;
    
    public Yazilimci(String ad, String soyad, double maas, String programlamaDili){
        super(ad,soyad,maas);
        this.programlamaDili=programlamaDili;
    }    
    
    public void kodYaz(){
        System.out.println(ad+" " +programlamaDili+" İle kod yazıyor.");
    }
    
    public void yazilimciBilgisiYazdir(){
        bilgileriYazdir();
        System.out.println("Programlama Dili: " +programlamaDili);
    }
 }
        