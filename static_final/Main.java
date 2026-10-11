
package staticandfinal;

public class Main {

    public static void main(String[] args) {
        Ogrenci o1=new Ogrenci("Leyla",90);
        Ogrenci o2=new Ogrenci("Ahmet",75);
        
        o1.bilgileriGoster();
        System.out.println();
        
        o2.bilgileriGoster();
        System.out.println();
        
        Ogrenci.ogrenciSayisiniGoster();
        
        System.out.println("Maksimim not: "+Ogrenci.MAX_NOT);
    }
    
}
