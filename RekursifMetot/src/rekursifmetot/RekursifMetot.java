
package rekursifmetot;

public class RekursifMetot {

   
    public static void main(String[] args) {
        
        yazdir(0);
    }
    public static void yazdir(int n){
        if(n>10)return;
        System.out.println(n);
        
            yazdir(n+1);
        }
    
}
