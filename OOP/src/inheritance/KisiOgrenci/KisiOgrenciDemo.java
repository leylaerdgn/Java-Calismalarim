
package inheritance.KisiOgrenci;
public class KisiOgrenciDemo {

    public static void main(String[] args) {
        Ogrenci ogrenci1 =new Ogrenci();
        
        ogrenci1.ad= "Leyla";
        ogrenci1.soyad= "Erdoğan";
        ogrenci1.yas= 21;
        ogrenci1.okulNo= 12345;
        
        ogrenci1.bilgiYazdir();
        ogrenci1.dersCalis();
        
        System.out.println("Okul no: " +ogrenci1.okulNo);
    
    }
    
    
}