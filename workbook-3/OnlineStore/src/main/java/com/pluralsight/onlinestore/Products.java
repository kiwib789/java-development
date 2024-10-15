package com.pluralsight.onlinestore;



public class Products {
    String SKU;
    String productName;
    double price;
    String department;


    // constructor
    public Products(String sku, String name, double price, String department) {
        this.SKU = sku;
        this.productName = name;
        this.price = price;
        this.department = department;
    }


    //getters and setters
    public String getSku() {
        return SKU;
    }

    public void setSku(String sku) {
        this.SKU = sku;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("SKU: %s | Name: %s | Price: %.2f | Department: %s", SKU, productName, price, department);
    }
}
