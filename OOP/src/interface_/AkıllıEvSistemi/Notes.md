##KOD AÇIKLAMASI
Gerçek Hayatı Düşünelim
Evimizde 3 cihaz var: Akıllı Lamba, Klima, Güvenlik Kamerası
Bunların ortak özellikleri var mı? Evet.
Hepsinin: Cihaz adı ve Markası var
Bu yüzden ortak özellikleri tek yerde topluyoruz: ####abstract class SmartDevice

##SmartDevice Dosyası
Bu dosyada ana mantık: Bütün akıllı cihazların adı ve markası vardır.
Böylece her sınıfta tekrar tekrar:
String deviceName;
String brand; yazmıyoruz.

###Neden Abstract?
Çünkü: new SmartDevice(...) oluşturmak mantıklı değil.
Gerçekte: Smart Device diye bir cihaz satın almıyorsun.
Sen: Lamba, Klima, Kamera alıyorsun.
Yani SmartDevice sadece ortak yapıyı temsil ediyor.

##Interface Kısmı
Her cihazın yapabildiği işler aynı mı? Hayır.
Lamba: Açılıp, kapanıyor.
Klima: Açılıp, kapanıyor.
WiFi'ye bağlanmak
Kamera: Açılıp ,kapanıyor, wifiye bağlanıyor, kayıt yapıyor.
Bu yüzden interface oluşturduk.

##Switchable
Bu interface'i kullanan cihaz açılıp kapanabilmelidir.

##Connectable
Bu cihaz internete bağlanabilmelidir.

##Recordable
Bu cihaz kayıt yapabilmelidir.

##SmartLight
class SmartLight
extends SmartDevice -> akıllı bir cihazdır 
implements Switchable -> açılıp,kapanabilir.

##AirConditioner
class AirConditioner
extends SmartDevice
implements Switchable, Connectable

##SecurityCamera
class SecurityCamera
extends SmartDevice
implements Switchable,
           Connectable,
           Recordable

##Polimorfizm Nerede?
Şu kısım:
    Switchable[] switches = {

        new SmartLight(...),

        new AirConditioner(...),

        new SecurityCamera(...)
    }; 
polimorfizm kullanılmasının amacı, cihazların türüyle tek tek ilgilenmeden ortak 
davranışları üzerinden işlem yapabilmektir. Örneğin sistem bir nesnenin lamba, klima 
veya kamera olup olmadığını bilmek zorunda değildir; sadece Switchable arayüzünü 
uyguladığını bilir ve bu sayede turnOn() veya turnOff() metodlarını çağırabilir. 
Böylece yeni bir cihaz eklendiğinde mevcut kodları değiştirmeden sisteme dahil edilebilir. 
Polimorfizm, farklı nesneleri tek bir üst tür (interface veya abstract class) altında 
toplayarak daha esnek, okunabilir ve genişletilebilir bir yapı kurulmasını sağlar.