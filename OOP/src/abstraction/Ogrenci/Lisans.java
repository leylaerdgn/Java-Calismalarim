
package abstraction.Ogrenci;

public class Lisans extends Student{
    int vize;
    int finalNot;
    
   public Lisans(String name, int ogrNo, int vize,int finalNot){
    super(name,ogrNo);
    this.vize=vize;
    this.finalNot=finalNot;
    }
   
   @Override
   public double calculateAvarage(){
       return vize*0.40+finalNot*0.60;
   }
 }
