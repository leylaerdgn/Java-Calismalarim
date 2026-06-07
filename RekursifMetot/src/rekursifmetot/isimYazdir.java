
package rekursifmetot;

public class isimYazdir {

    public static void main(String[] args) {
        int[] dizi={1,2,3,4};
        System.out.println(rakam(dizi));
    }
    public static boolean rakam(int[] dizi){
        if(dizi.length==0) return false;
        
        for(int i=0; i<dizi.length;i++){
            if(dizi[i]==5){
                return true;
            }
        }
        return false;
    }
}
