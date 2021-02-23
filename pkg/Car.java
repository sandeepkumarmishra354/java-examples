package pkg;

public class Car {
    String company;
    String model;
    Double price;

    public Car() {
        System.out.println("I'm Empty constructor of car class.");
    }

    public Car(String cmpny, String mdl, Double prc) {
        this.company = cmpny;
        this.model = mdl;
        this.price = prc;
        System.out.println("I'm a parameterized constructor of car class.");
    }

    public void showAllInfo() {
        System.out.println("Car Company: "+this.company);
        System.out.println("Car Model: "+this.model);
        System.out.println("Car Price: "+this.price);
    }
}