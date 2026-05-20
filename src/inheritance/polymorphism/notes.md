## Polymorphism Nedir?
Bir nesnenin, üst sınıf türünden referansla tutulup, kendi alt sınıf davranışını çalıştırabilmesidir.
Polymorphism’te sol taraf üst sınıf, sağ taraf alt sınıf olabilir.
Örnek: Hayvan h1 = new Kedi();

## Polymorphism neden işe yarar?

Diyelim ki elimizde birçok hayvan var:
    Kedi kedi = new Kedi();
    Kopek kopek = new Kopek();
    Kus kus = new Kus();

Her biri için ayrı ayrı metot yazmak kötü olurdu:
    kedi.sesCikar();
    kopek.sesCikar();
    kus.sesCikar();

Ama polymorphism sayesinde hepsini tek bir üst türde tutabiliriz:
    Hayvan[] hayvanlar = new Hayvan[3];
    hayvanlar[0] = new Kedi();
    hayvanlar[1] = new Kopek();
    hayvanlar[2] = new Kus();

Sonra döngüyle hepsine aynı metodu çağırırız:
    for (Hayvan h : hayvanlar) {
        h.sesCikar();
    }

## Polymorphism neden kullanılıyor?
Polymorphism, bir üst sınıf referansı ile farklı alt sınıf nesnelerini 
kullanmamızı sağlar. Böylece aynı metot çağrısı, nesnenin gerçek 
tipine göre farklı davranır. Kod tekrarını azaltır ve daha esnek yapı kurmamızı sağlar.