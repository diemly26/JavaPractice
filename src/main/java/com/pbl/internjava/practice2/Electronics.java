package com.pbl.internjava.practice2;

public class Electronics extends Goods {
    private int warrantyMonths;
    private double powerKW;

    public Electronics(String productCode, String name, int quantity, double unitPrice,
                       int warrantyMonths, double powerKW) {
        super(productCode, name, quantity, unitPrice);
        this.warrantyMonths = Math.max(0, warrantyMonths);
        this.powerKW = Math.max(0, powerKW);
    }

    @Override
    public double getVAT() {
        return 0.10;
    }

    @Override
    public String evaluateConsumption() {
        if (quantity < 3) return "Fast-selling";
        return "Normal";
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics:");
        super.displayInfo();
        System.out.println("Warranty: " + warrantyMonths + " months | Power: " + powerKW + "KW");
        System.out.println("VAT: " + (getVAT() * 100) + "%");
        System.out.println("Evaluation: " + evaluateConsumption());
        System.out.println();
    }
}
