
package interface_;

public class YurticiKargo implements Kargo{
    
    @Override
    public void kargoGonder(String urunAdi){
        System.out.println(urunAdi+" Yurtiçi kargo ile gönderildi.");
    }
}
