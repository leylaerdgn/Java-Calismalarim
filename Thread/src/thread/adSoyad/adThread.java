
package thread.adSoyad;

public class adThread extends Thread{
     public void run(){
         long baslangic=System.currentTimeMillis(); //Bilgisayarın şu anki zamanını milisaniye olarak verir.
         while(System.currentTimeMillis()- baslangic<240000){
             System.out.println("Leyla");
             try{
                 Thread.sleep(100); //Bu thread'i 100 milisaniye uyut.
             }catch(InterruptedException e){
                 e.printStackTrace();
             }
         }
         
     }
}
