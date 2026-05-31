
package class_object;

public class Employee {
    private String name;
    public double salary;
    private int workHours, hireyear;
    
    Employee(int hireYear, int workHours, double salary, String name){
          this.name= name;
          this.salary=salary;
          this.workHours=workHours;
          this.salary=salary;
    }
    public double tax(){
        if(this.salary >=1000){ // this denmesinin sebebi claastaki field'ı aldığı için.
            return 1000*0.03;
        }
        return 0.0;
    }
    public double bonus(){
        int extraHours=this.workHours-40;
        if(extraHours > 0){
             return 30*this.workHours;
        }
        return 0.0;
    }
    public double increase(){
        int year =2020- this.hireyear;
        if(year<10){
            return salary*0.5;
        }else if (year >= 10 && year<20){
            return salary*0.10;
        }else{
            return salary*0.15;
        }        
    }
}
