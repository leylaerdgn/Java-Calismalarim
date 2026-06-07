//Kendisine parametre oalrak gelen tek boyutlu string dizisi içindeki 
//en uzun ve en kısa karakter sayısına sahip olan stringleri bulup ekrana yaz.
package rekursifmetot;

public class StringUzunluk {

    public static void main(String[] args) {
        String[] dizi={"Java","Bilgisayar", "C","Programlama"};
        bul(dizi);
    }
    public static void bul(String[] dizi){
       String enUzun=dizi[0];
       String enKisa=dizi[0];
       
       for(int i=1;i<dizi.length;i++){
           
           if(dizi[i].length()> enUzun.length()){
               enUzun=dizi[i];
           }
       }
        System.out.println("En uzun string: "+enUzun);
        System.out.println("En kısa string: "+enKisa);
     }
}
