
package polymorphism;

public class HavaleOdeme extends Odeme{
    private String iban;
    
    public HavaleOdeme(double tutar, String iban){
        super(tutar);
        this.iban=iban;
    }
    
    @Override
    public void odemeYap(){
        System.out.println(tutar+" TL havale ile ödendi.");
        System.out.println("IBAN: "+iban);
    }
}
