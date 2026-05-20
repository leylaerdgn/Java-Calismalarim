
package polymorphism;

public class KapidaOdeme extends Odeme{
    private String adres;
    
    public KapidaOdeme(double tutar, String adres){
        super(tutar);
        this.adres=adres;
    }
    
    @Override
    public void odemeYap(){
        System.out.println(tutar+ " TL kapıda ödeme olarak alınacak.");
        System.out.println("Teslimat adresi: "+adres);
    }
}
