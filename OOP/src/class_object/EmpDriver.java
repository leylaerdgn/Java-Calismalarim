
package class_object;

public class EmpDriver {
    
    public static void main(String[] args) {
        Employee emp1= new Employee(1985,45,2000.0,"Leyla");
        System.out.println("Name: "+emp1.getName());
        System.out.println("Tax: "+emp1.tax());
        System.out.println("Bonus: "+emp1.bonus()); 
        System.out.println("İncrease Salary: "+emp1.increase());
        double totalSalary=emp1.getSalary()-emp1.tax()+emp1.bonus();
        System.out.println("Total salary with tax and bonus: "+totalSalary);
        System.out.println("Total salary with raise: "+(emp1.getSalary()+emp1.increase()));
    }
}
