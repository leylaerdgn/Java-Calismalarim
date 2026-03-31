
package rekursifmetot;


public class aHarfİndis {

    public static void harf_bul(String str, int index){
        if(index== str.length()){
            return;
        }
        if(str.charAt(index)=='a'){
            System.out.println("'a' found at index: " +index);
        }
        harf_bul(str,index+1);
    }
    public static void main(String[] args) {
       String input ="Java programming is amazing!";
       harf_bul(input,0);
    }
    
}
