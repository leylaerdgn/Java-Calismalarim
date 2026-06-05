
package abstraction.Calisan;
public class TamZamanliCalisan extends Calisan{
    double aylikMaas;
    
    public TamZamanliCalisan(String ad, double aylikMaas){
        super(ad);
        this.aylikMaas=aylikMaas;
    }
    
    @Override
    public double maasHesapla(){
        return aylikMaas;
    }
}
