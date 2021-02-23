package pkg;

public class Employee {
    String fullName;
    String department;
    double salery;
    int age;

    public Employee() {
        System.out.println("I'm empty constructor of employee class.");
    }

    public Employee(String fname, String dept, double slry, int a) {
        System.out.println("I'm parameterized costructor of Employee class.");
        this.fullName = fname;
        this.department = dept;
        this.salery = slry;
        this.age = a;
    }

    public void showFullInfo() {
        System.out.println("Employee name: " + this.fullName);
        System.out.println("Employee department: " + this.department);
        System.out.println("Employee salery: " + this.salery);
        System.out.println("Employee age: " + this.age);
    }
}
