
package abstraction.Calisan;
public abstract class Calisan {
    String ad;
    
    public Calisan(String ad){
        this.ad=ad;
    }
    
    public abstract double maasHesapla(); //Her çalışan maaş hesaplayacak ama nasıl hesaplayacağını ben burada yazmıyorum.
    
    public void bilgiYazdir(){
        System.out.println("Çalışan adı: " +ad);
    }
}
