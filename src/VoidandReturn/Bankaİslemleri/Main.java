package VoidandReturn.Bankaİslemleri;

public class Main {
    public static void main(String[] args) {
    BankaHesabi b= new BankaHesabi(1000);
    b.paraYatirma(200);
    int bonus1= b.bonus(300);
    System.out.println("Bonus eklenmiş hali: " + bonus1*2);
}
}