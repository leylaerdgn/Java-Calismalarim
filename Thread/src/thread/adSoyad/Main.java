
package thread.adSoyad;

public class Main {

    public static void main(String[] args) {
        adThread t1=new adThread();
        soyadThread t2=new soyadThread();
        
        t1.start();
        t2.start();
    }
    
}
