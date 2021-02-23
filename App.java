import pkg.Car;
import pkg.Employee;
import pkg.Pizza;

public class App {
    public static void main(String args[]) {
        Car car1 = new Car();
        Car car2 = new Car("Tata", "Safari", 12.50);
        car2.showAllInfo();
        System.out.println("---------------------");

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("John wick", "killing", 12000, 45);
        emp2.showFullInfo();
        System.out.println("---------------------");

        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Large", "2X", 12);
        pizza2.showFullInfo();
    }
}
