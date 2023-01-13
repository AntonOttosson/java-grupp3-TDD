package se.nackademin;

import java.util.HashMap;

public class Inventory {
    private String vendor;
    public String productName;
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

    public String setProductName(String productName) {
        this.productName = productName;
        return this.productName;
    }

    public String getProductName() {
        productMap.get(productName);
        return productName;
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
