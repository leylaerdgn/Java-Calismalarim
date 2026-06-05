
package interface_.AkıllıEvSistemi;

public class SmartLight extends SmartDevice implements Switchable{
    
    public SmartLight(String deviceName, String brand){
        super(deviceName,brand);
    }
    
    @Override
    public void turnOn(){
        System.out.println(deviceName+" açıldı");
    }
    
    @Override
    public void turnOff(){
        System.out.println(deviceName+" kapatıldı");
    }
 
    
}
