/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.employee;

public class Employee {
    protected String name;
    
    public Employee(String name){
        this.name=name;
    }
    
    public double calculateSalary(){ //maaş hesapla
        return 0;
    }
    
    public void showInfo(){
        System.out.println("Çalışan: "+name);
        System.out.println("Maaş: "+calculateSalary());
    }
    
}
