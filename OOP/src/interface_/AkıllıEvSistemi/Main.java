
package interface_.AkıllıEvSistemi;

public class Main {

    public static void main(String[] args) {
        SmartDevice[] devices={
            new SmartLight("Salon Lambası", "Phillips"),
            new AirConditioner("Klima", "Arçelik"),
            new SecurityCamera("Güvenlik Kamerası", "Xiaomi")
        };
        
        System.out.println("---Cihaz Bilgileri---");
        for(SmartDevice device:devices){
            device.showInfo();
            System.out.println("----------");
        }
        System.out.println();
        System.out.println("---Açma İşlemi---");
        Switchable[] switches={
            new SmartLight("Salon Lambası","Philiphs"),
            new AirConditioner("Klima", "Arçelik"),
            new SecurityCamera("Güvenlik Kamerası", "Xiaomi")
        };
        for(Switchable s: switches){
            s.turnOn();
        }
        System.out.println();
        SecurityCamera camera= new SecurityCamera("Güvenlik Kamerası","Xiaomi");
        camera.connectWifi();
        camera.startRecording();
    }
    
}
