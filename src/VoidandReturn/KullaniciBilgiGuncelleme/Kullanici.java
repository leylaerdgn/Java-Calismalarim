package VoidandReturn.KullaniciBilgiGuncelleme;

public class Kullanici {
 String isim;
 
 public Kullanici(String isim){
    this.isim=isim;
 }
 public void isimGuncelle(String isim){
    this.isim=isim;
    System.out.println("yeni isim: "+isim);  
 }
 public String isimDondur(){
    return isim;
 }
}
