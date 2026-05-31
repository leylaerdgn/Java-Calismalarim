package inheritance;

public class Calisan {

    String ad;
    String soyad;
    double maas;

    public Calisan(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public void bilgileriYazdir() {
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Maaş: " + maas);
    }

    public void calis() {
        System.out.println(ad + " çalışıyor.");
    }
}
