package pkg;

public class Pizza {

    public static int bakedPizzaCount = 0;

    String base;
    String size;
    int toppins;

    public Pizza() {
        System.out.println("I'm empty constructor of pizza class.");
    }

    public Pizza(String base, String size, int toppins) {
        System.out.println("I'm parameterized constructor of Pizza class.");
        this.base = base;
        this.size = size;
        this.toppins = toppins;
    }

    public void showFullInfo() {
        System.out.println("Pizza base: " + this.base);
        System.out.println("Pizza size: " + this.size);
        System.out.println("Pizza toppins: " + this.toppins);
    }

    public void bake() {
        System.out.println("Baking  pizza...");
        int count = Pizza.bakedPizzaCount + 1;
        Pizza.bakedPizzaCount = count;
    }

    public static int getBakedPizzaCount() {
        return Pizza.bakedPizzaCount;
    }
}
