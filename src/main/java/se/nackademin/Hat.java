package se.nackademin;

public class Hat implements Product {
    String name, brand, size, color, productname, producttype;
    float price;

    Hat(String name, String brand, String size, String color, Float price, String productname, String producttype) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.productname = productname;
        this.producttype = producttype;
    }

    @Override
    public void addToCart(int Increment) {

    }

    @Override
    public void removeFromCart(int Decrement) {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  String getName(String name){
        return name;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand(String brand){
        return brand;
    }

    @Override
    public void setProductName(String productname) {
        this.productname = productname;
    }

    @Override
    public String getProductname(String productname){
        return productname;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSize(String size){
        return size;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public float getPrice(float price){
        return price;
    }

    @Override
    public void setProductType(String producttype) {
        this.producttype = producttype;
    }

    @Override
    public String getProducttype(String producttype){
        return producttype;
    }
    
    @Override
    public void inStock(Boolean newValue) {

    }
}
