package pkg;

public class Vehicle {
    private String vehicleManufacturer;
    protected String vehicleNumber;
    double vehiclePrice;
    public String vehicleModel;

    public Vehicle(String vehicleManufacturer, String vehicleNumber, double vehiclePrice, String vehicleModel) {
        System.out.println("I'm parameterized costructor of Vehicle class.");
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleNumber = vehicleNumber;
        this.vehiclePrice = vehiclePrice;
        this.vehicleModel = vehicleModel;
    }

    public void showFullInfo() {
        System.out.println("manufacturer:"+this.vehicleManufacturer);
        System.out.println("number:"+this.vehicleNumber);
        System.out.println("price:"+this.vehiclePrice);
        System.out.println("model:"+this.vehicleModel);
    }
}
