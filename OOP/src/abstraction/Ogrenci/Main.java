
package abstraction.Ogrenci;

public class Main {

    public static void main(String[] args) {
     Student s1=new Lisans("Ahmet",101,70,90);
     Student s2= new YuksekLisans("Ayşe",201,85,95);
     
     Student[] students={s1,s2};
     for(Student s: students){
         s.showInfo();
         System.out.println("Ortalama: " +s.calculateAvarage());
         
         System.out.println("-----------------");
     }
    }
}
