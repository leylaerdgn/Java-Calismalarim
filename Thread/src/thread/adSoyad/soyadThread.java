
package thread.adSoyad;

public class soyadThread extends Thread{
    
    @Override
    public void run(){
        long baslangic=System.currentTimeMillis();
        
        while(System.currentTimeMillis() -baslangic < 240000){
            System.out.println("Erdoğan");
            
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
