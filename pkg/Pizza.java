package pkg;

public class Pizza {
    String base;
    String size;
    int toppins;

    public Pizza() {
        System.out.println("I'm empty constructor of pizza class.");
    }

    public Pizza(String bse, String sz, int tpns) {
        System.out.println("I'm parameterized constructor of pizza class.");
        this.base = bse;
        this.size = sz;
        this.toppins = tpns;
    }

    public void showFullInfo() {
        System.out.println("Pizza base: "+this.base);
        System.out.println("Pizza size: "+this.size);
        System.out.println("Pizza toppins: "+this.toppins);
    }
}
