package se.nackademin;

public class Cap extends Hat {

    Cap(String name, String brand, String size, String color, float price, String productname, String producttype) {
        super(name, brand, size, color, price, productname, producttype);
        // this.name = name;
        // this.brand = brand;
        // this.size = size;
        // this.color = color;
        // this.price = price;

    }

    public String getName() {
        return this.name;
    }
}
