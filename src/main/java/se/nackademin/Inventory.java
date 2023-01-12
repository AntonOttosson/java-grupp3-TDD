package se.nackademin;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class Inventory {
    private String vendor;
    private String productName;
    private Boolean inStock;
    public HashMap<String, Integer> productMap = new HashMap<String, Integer>();

    public Inventory(String vendor, String productName, Boolean inStock) {
        this.vendor = vendor;
        this.productName = productName;
        this.inStock = inStock;
    }

    public Inventory() {}

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private Integer getProductName(String productName) {
        return productMap.get(productName);
    }

    public Boolean checkStock(String productName) {
        if (productMap.get(productName) == null) {
            this.inStock = false;
            return this.inStock;
        }
        else {
            this.inStock = true;
            return this.inStock;
        }
    }

    public void addToStock(String productName, int amount) {
        productMap.put(productName, amount);
    }
}
