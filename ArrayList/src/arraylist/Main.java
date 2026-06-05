
package arraylist;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<String> ogrenciler = new ArrayList<>();

        ogrenciler.add("Leyla");
        ogrenciler.add("Yağmur");
        ogrenciler.add("Bilal");

        System.out.println(ogrenciler);

        System.out.println("İlk öğrenci: " + ogrenciler.get(0));

        ogrenciler.set(1, "Zeynep");

        ogrenciler.remove("Bilal");

        System.out.println("Güncel liste:");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        System.out.println("Öğrenci sayısı: " + ogrenciler.size());
    }
    
}
