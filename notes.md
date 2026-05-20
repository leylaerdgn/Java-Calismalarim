## Class Nedir?
Class, bir nesnenin şablonudur.
Yani “öğrenci” diye bir varlık olacaksa, öğrencinin hangi özellikleri ve 
davranışları olacak bunu class içinde tanımlarız.

Örnek: 
public class Student {
    String name;
    int age;
    String department;
}

## Object Nedir?
Object, class’tan oluşturulan gerçek nesnedir.
Mesela: "Student student1 = new Student();"
Bu kısım "Student class'ından yeni bir öğrenci nesnesi oluştur" anlamına gelir.
Student -> class tipi
student1 -> nesnenin adı
new Student() -> bellekte yeni bir nesne oluşturur.

## Field / Attribute Nedir?
Class içinde tanımlanan değişkenlere field veya attribute denir.
Örnek:
public class Car {
    String brand;   -
    String model;   -   > attribute
    int year;       -
}

## Metot nedir?
Method, class içindeki davranıştır. Yani nesnenin yapabildiği işleri temsil eder.
Örnek:
    void start() {
        System.out.println("Araba çalıştı.");
    }
    void stop() {
        System.out.println("Araba durdu.");
    }

## Constructor Nedir?
Constructor, nesne oluşturulurken çalışan özel metottur.
Örnek:
  public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
## this Nedir?
this, içinde bulunduğumuz nesneyi temsil eder.
Örnek: 
public Student(String name, int age) {
    this.name = name;
    this.age = age;
}
iki tane name var. biri class'ın field'ı iken diğeri constructora gelen parametredir.
"Bu nesnenin name alanına, dışarıdan gelen name değerini ata." anlamına gelir

## Default Constructor Nedir?
Eğer class içine constructor yazmazsan Java otomatik olarak boş constructor verir.
Örnek:
public class Student {
    String name;
    int age;
}

## Encapsulation Nedir?
"Class içindeki verileri direkt dışarıya açma. Veriye kontrollü erişim sağla." anlamına gelir.

## private, public, protected Nedir?
| Modifier    | Anlamı                                               |
| ----------- | ---------------------------------------------------- |
| `public`    | Her yerden erişilebilir                              |
| `private`   | Sadece aynı class içinden erişilebilir               |
| `protected` | Aynı package ve miras alan class’lardan erişilebilir |
| default     | Sadece aynı package içinden erişilebilir             |


## Getter ve Setter Nedir?
Private field’lara kontrollü erişmek için getter ve setter kullanılır.


## super Nedir?
super, parent class’ı temsil eder.

## Method Overriding Nedir?
Bir child class’ın parent class’taki metodu kendine göre yeniden yazmasına overriding denir.

## Method Overloading Nedir?
Overloading, aynı isimli metodu farklı parametrelerle kullanmaktır.

## Static nedir?
static, class’a ait olan şey demektir.