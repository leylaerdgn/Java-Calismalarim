
package abstraction.Ogrenci;

public abstract class Student {
    String name;
    int ogrNo;
    
    public Student(String name, int ogrNo){
        this.name=name;
        this.ogrNo=ogrNo;
    }
    
    abstract double calculateAvarage();
    
    public void showInfo(){
        System.out.println("Öğrenci adı: " + name);
        System.out.println("Öğrenci Numarası: " + ogrNo);
    }
}
