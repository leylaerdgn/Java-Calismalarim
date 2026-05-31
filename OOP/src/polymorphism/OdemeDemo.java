
package polymorphism;

public class OdemeDemo {
    public static void main(String[] args) {
        
        Odeme[] odemeler= new Odeme[3];
        
        odemeler[0] = new KrediKartiOdeme(1200,"1234-5678-9087");
        odemeler[1]=new HavaleOdeme(2500,"TR12 3444 3333 5555");
        odemeler[2]=new KapidaOdeme(750,"elazığ merkez");
        
        for(Odeme odeme:odemeler){
            odeme.odemeYap();
            odeme.makbuzYazdir();
            System.out.println("----------------------");
        }
    }
}
