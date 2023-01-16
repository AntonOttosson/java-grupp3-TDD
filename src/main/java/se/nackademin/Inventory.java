package se.nackademin;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private String vendor;
    private boolean vendorExists;
    public String productName;
    private Boolean inStock;
    public HashMap<String, Integer> productMap = new HashMap<String, Integer>();
    public List<String> vendorList = new ArrayList<>();

    public Inventory(String vendor, String productName, Boolean inStock, Boolean vendorExists) {
        this.vendor = vendor;
        this.vendorExists = vendorExists;
        this.productName = productName;
        this.inStock = inStock;
    }

    public Inventory() {}

    public String setNewVendor(String vendor) {
        this.vendor = vendor;
        vendorList.add(0, this.vendor);
        return this.vendor;
    }

    public String getVendorName(int index) {
        String element = vendorList.get(index);
        return element;
    }

    public Boolean checkVendorAvailability(String element) {
        if (element.isBlank()) {
            this.vendorExists = false;
            return this.vendorExists;
        }
        else {
            this.vendorExists = true;
            return this.vendorExists;
        }
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
