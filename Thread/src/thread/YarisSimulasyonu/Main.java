
package thread.YarisSimulasyonu;

public class Main {

    public static void main(String[] args) {
      Kosucu k1=new Kosucu("Ali");
      Kosucu k2= new Kosucu("Veli");
      
      k1.start();
      k2.start();

    }
    
}
