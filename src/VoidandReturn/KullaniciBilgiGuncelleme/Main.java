package VoidandReturn.KullaniciBilgiGuncelleme;

public class Main{
public static void main(String[] args) {
    Kullanici k1 = new Kullanici("Leyla");
    k1.isimGuncelle("Ahmet");
    String isim2= k1.isimDondur();
    System.out.println("İsim:" +isim2);
}
}