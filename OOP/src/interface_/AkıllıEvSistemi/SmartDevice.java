
package interface_.AkıllıEvSistemi;

public abstract class SmartDevice {
    protected String deviceName; //cihaz adı
    protected String brand; //marka
    
    public SmartDevice(String deviceName, String brand){
        this.deviceName=deviceName;
        this.brand=brand;
        
    }
    public void showInfo(){
        System.out.println("Cihaz: "+deviceName);
        System.out.println("Marka: "+brand);
    }
}
