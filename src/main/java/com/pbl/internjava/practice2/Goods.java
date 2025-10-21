package com.pbl.internjava.practice2;

public abstract class Goods {
    protected String productCode;
    protected String name;
    protected int quantity;
    protected double unitPrice;

    public Goods(String productCode, String name, int quantity, double unitPrice) {
        this.productCode = productCode;
        this.name = name;
        this.quantity = Math.max(0, quantity);
        this.unitPrice = Math.max(0, unitPrice);
    }

    public String getProductCode() {
        return productCode;
    }

    public abstract double getVAT();
    public abstract String evaluateConsumption();

    public void displayInfo() {
        System.out.println("Code: " + productCode + " | Name: " + name);
        System.out.println("Quantity: " + quantity + " | Price: " + unitPrice);
    }
}
