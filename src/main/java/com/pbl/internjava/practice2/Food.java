package com.pbl.internjava.practice2;

import java.time.LocalDate;

public class Food extends Goods {
    private LocalDate manufactureDate;
    private LocalDate expiryDate;
    private String supplier;

    public Food(String productCode, String name, int quantity, double unitPrice,
                LocalDate manufactureDate, LocalDate expiryDate, String supplier) {
        super(productCode, name, quantity, unitPrice);
        if (expiryDate.isBefore(manufactureDate)) {
            throw new IllegalArgumentException("Expiry date must be after manufacture date!");
        }
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.supplier = supplier;
    }

    @Override
    public double getVAT() {
        return 0.05;
    }

    @Override
    public String evaluateConsumption() {
        LocalDate now = LocalDate.now();
        if (quantity > 0 && expiryDate.isBefore(now)) {
            return "Hard to sell (expired)";
        }
        return "Normal";
    }

    @Override
    public void displayInfo() {
        System.out.println("Food:");
        super.displayInfo();
        System.out.println("Manufacture: " + manufactureDate + " | Expiry: " + expiryDate);
        System.out.println("Supplier: " + supplier);
        System.out.println("VAT: " + (getVAT() * 100) + "%");
        System.out.println("Evaluation: " + evaluateConsumption());
        System.out.println();
    }
}
