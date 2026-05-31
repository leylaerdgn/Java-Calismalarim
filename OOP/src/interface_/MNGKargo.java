
package interface_;

public class MNGKargo implements Kargo{
    
    @Override
    public void kargoGonder(String urunAdi){
        System.out.println(urunAdi+" MNG Kargo ile gönderildi");
    }
}
