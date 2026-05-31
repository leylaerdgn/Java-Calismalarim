
package interface_;

public class KargoDemo {
    public static void main(String[] args) {
        
        Kargo kargo1= new YurticiKargo();
        Kargo kargo2= new ArasKargo();
        Kargo kargo3=new MNGKargo();
        
        kargo1.kargoGonder("Laptop");
        kargo2.kargoGonder("Telefon");
        kargo3.kargoGonder("Kulaklık");
    }
            
}
