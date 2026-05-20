
package inheritance.polymorphism;

public class KrediKartiOdeme extends Odeme{
    private String kartNo;
    
    public KrediKartiOdeme(double tutar, String kartNo){
        super(tutar);
        this.kartNo=kartNo;
    }
    
    @Override
    public void odemeYap(){
        System.out.println(tutar +" Tl kredi kartı ile ödendi.");
        System.out.println("Kart no: "+kartNo);
    }
}
