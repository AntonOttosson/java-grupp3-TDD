package se.nackademin;

public interface Product {

    void addToCart(int Increment);

    void removeFromCart(int Decrement);

    void setPrice(float price);
    
    float getPrice(float price);

    void setName(String name);

    String getName(String name);

    void setBrand(String brand);

    String getBrand(String brand);

    void setSize(String size);

    String getSize(String size);

    void setProductName(String productname);

    String getProductname(String productname);

    void inStock(Boolean newValue);

    void setProductType(String producttype);

    String getProducttype(String producttype);

}
