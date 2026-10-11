
package polymorphism.employee;

public class Manager extends Employee{
    private double baseSalary;
    
    public Manager(String name, double baseSalary){
        super(name);
        this.baseSalary=baseSalary;
    }
    @Override
    public double calculateSalary(){
        return baseSalary+10000;
    }
}
