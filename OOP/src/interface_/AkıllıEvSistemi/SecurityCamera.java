
package interface_.AkıllıEvSistemi;

public class SecurityCamera extends SmartDevice implements Switchable, Connectable, Recordable{
    
    public SecurityCamera(String deviceName, String brand){
        super(deviceName,brand);
    }
    
    @Override
    public void turnOn(){
        System.out.println(deviceName+" aktif edildi.");
    }
    
    @Override
    public void turnOff(){
        System.out.println(deviceName+" kapatıldı.");
    }
    
    @Override
    public void connectWifi(){
        System.out.println(deviceName+" Wifi'ye bağlandı.");
    }
    
    @Override
    public void startRecording(){
        System.out.println(deviceName+" kayıt yapıyor.");
    }
}
