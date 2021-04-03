package class24.demo;

public class Employee {
    double salary;
    void work(){
        System.out.println("Employee is working");
    }
    void getPaid(){
        System.out.println("Employee is getting paid"+salary+" other benefits");
    }
    void goOnLeaves(){
        System.out.println("Employee is going on leaves");
    }
}
class  FullTimeEmp extends Employee{

}
class PartTimeEmp extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("Part time employee don't get leaves");
    }
}
class Contractor extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("Contractor employee don't get leaves");
    }

    @Override
    void getPaid() {
        System.out.println("paid on hourly basis "+salary);

    }

}

