package class_object;

//Bu metotlarda void kullanılmış. Bu şu anlama gelir: "Bu metod bir değer döndürmeyecek, sadece bir işlem yapacak."
//Amaş sonuç hesaplamak değil, nesnenin durumunu değiştirmektir.
 
public class Bicycle {
    int cadance = 0; //Pedal çevirme hızı
    int speed = 0; //Bisiklet hızı
    int gear = 1; //vites
    
    void changeCadence(int newValue){
        cadance=newValue;
    }
    void changeGear(int newValue){
        gear=newValue;
    }
    void speedUp(int increment){
        speed+= increment;
    }
    void applyBrakes(int decrement){//Fren Yapma Metodu
        speed-=decrement;
    }
    void printStates(){ //Bilgileri Yazdırma Metodu
        System.out.println("Cadence: "+cadance
        + "Speed: " +speed + "Gear: "+gear);
    }
}
