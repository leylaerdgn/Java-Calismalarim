package inheritance.polymorphism;

public class polymorphismDemo {

    public static void main(String[] args) {

        Hayvan[] hayvanlar = new Hayvan[3];

        hayvanlar[0] = new Kedi();
        hayvanlar[1] = new Kopek();
        hayvanlar[2] = new Kus();

        for (Hayvan hayvan : hayvanlar) {
            hayvan.sesCikar();
        }
    }
}