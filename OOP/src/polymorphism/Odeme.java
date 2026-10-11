
package polymorphism;

//Bu üst sınıf. Ortak olan her şey burada.
public class Odeme {
    protected double tutar;
    
    public Odeme(double tutar){
        this.tutar=tutar;
    }
    
    public void odemeYap(){
        System.out.println("Genel ödeme yapıldı. Tutar: " +tutar);
    }
    
    public void makbuzYazdir(){
        System.out.println("Makbuz oluşturuldu. Tutar: " +tutar+ "TL");
    }
}
