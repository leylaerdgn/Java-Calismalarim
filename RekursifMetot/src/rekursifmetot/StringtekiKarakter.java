
package rekursifmetot;


public class StringtekiKarakter {


    public static void main(String[] args) {
        System.out.println (count("computer organization",'o'));
    }
    
public static int count(String str, char a) {
   if(str.length()<1) return 0; 
    //Eğer stringin uzunluğu 1’den küçükse (yani boşsa), artık kontrol edilecek karakter kalmamış demektir. Bu durumda 0 döner.
    else if(str.charAt(str.length()-1)==a)        
    return 1+ count(str.substring(0,str.length()-1),a);
    else return 0+ count(str.substring(0,str.length()-1),a);
    }
}