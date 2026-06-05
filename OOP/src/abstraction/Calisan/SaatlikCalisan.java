
package abstraction.Calisan;
public class SaatlikCalisan extends Calisan{
    int calisilanSaat;
    double saatUcreti;
    
    public SaatlikCalisan(String ad, int calisilanSaat, double saatUcreti){
        super(ad);
        this.calisilanSaat=calisilanSaat;
        this.saatUcreti=saatUcreti;
    }
    
    @Override
    public double maasHesapla(){
        return calisilanSaat*saatUcreti;
    }
}
