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

        Pizza pizza1 = new Pizza("Base 1", "2X", 12);
        Pizza pizza2 = new Pizza("Base 2", "2X", 12);
        Pizza pizza3 = new Pizza("Base 3", "2X", 12);
        Pizza pizza4 = new Pizza("Base 4", "2X", 12);

        System.out.println("\n----------Pizza static count before bake----------");
        System.out.println("Total baked pizza: " + Pizza.getBakedPizzaCount() + "\n");

        pizza1.bake();
        pizza2.bake();
        pizza3.bake();
        pizza4.bake();

        System.out.println("\n----------Pizza static count after bake----------");
        System.out.println("Total baked pizza: " + Pizza.getBakedPizzaCount() + "\n");
    }
}
