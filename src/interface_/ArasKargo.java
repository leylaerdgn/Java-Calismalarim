
package interface_;

public class ArasKargo implements Kargo{
    
    @Override
    public void kargoGonder(String urunAdi){
        System.out.println(urunAdi+ " Aras kargo ile gönderildi.");
    }
}
