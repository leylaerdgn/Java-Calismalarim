
package abstraction.Ogrenci;

public class YuksekLisans extends Student{
    int projeNot;
    int tezNot;
    
    public YuksekLisans(String name,int ogrNo, int projeNot, int tezNot){
        super(name,ogrNo);
        this.projeNot=projeNot;
        this.tezNot=tezNot;
    }
    
    @Override
    public double calculateAvarage(){
        return projeNot*0.50+tezNot*0.50;
    }
    
   
    
}
