
package polymorphism.employee;

public class Main {

    public static void main(String[] args) {
        
        Employee e1 = new Developer("Ahmet", 30000); //Ben Employee referansı tutuyorum ama bunun içinde Developer nesnesi var.
        Employee e2 = new Manager("Ayşe",40000);
        Employee e3 = new Intern("Mehmet",12000);
        
        Employee[] employees={e1,e2,e3};
        
        for(Employee emp: employees){
            emp.showInfo();
            System.out.println("-----------");
        }
    }
    
}
