//Ama. iki koşucu olacak. Her biri 5 adım atsın. Her adım arasında 1 saniye beklesin.
package thread.YarisSimulasyonu;

public class Kosucu extends Thread {
    private String isim;
    
    public Kosucu(String isim){
        this.isim=isim;
    }
    
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(isim+ " : "+i+".adım");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(isim+" yarışı bitirdi!");
    }
    
}
