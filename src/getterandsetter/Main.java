package getterandsetter;

public class Main {
    public static void main(String[] args) {
       Ogrenci o1 = new Ogrenci(100);
       o1.setNot(92);
       int yeniNot= o1.getNot();
       System.out.println("Not: "+yeniNot);
    }
}
