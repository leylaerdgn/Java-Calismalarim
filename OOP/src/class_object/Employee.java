
package class_object;

public class Employee {
   private String name;
   private double salary;
   private int workHours;
   private int hireYear;
   
   public Employee(int hireYear, int workHours, double salary, String name){
       this.name=name;
       this.salary=salary;
       this.workHours=workHours;
       this.hireYear=hireYear;
   }
   
   //vergi hesaplama
   public double tax(){
       if(salary>=1000){
           return salary*0.03;
       }
       return 0.0;
   }
   
   public double bonus(){
       int extraHours=workHours-40;
       if(extraHours > 0){
           return extraHours*30;
       }
       return 0.0;
   }
   
   //maaş zammı
   public double increase(){
       int yearsWorked=2020-hireYear;
       if(yearsWorked<10){
           return salary*0.05;
       }else if(yearsWorked<20){
           return salary*0.10;
       }else{
           return salary*0.15;
       }
   }
   public double getSalary(){
       return salary;
   }
   public String getName(){
       return name;
   }
}
