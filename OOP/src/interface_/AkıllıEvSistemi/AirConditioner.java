
package interface_.AkıllıEvSistemi;

public class AirConditioner extends SmartDevice implements Switchable, Connectable{
    
    public AirConditioner(String deviceName, String brand){
        super(deviceName,brand);
    }
    
    @Override
    public void turnOn(){
        System.out.println(deviceName+" çalışıyor.");
    }
    
    @Override
    public void turnOff(){
        System.out.println(deviceName+" kapatıldı.");
    }
    
    @Override
    public void connectWifi(){
        System.out.println(deviceName+" Wifi'ye bağlandı");
    }
    
}
