package com.pbl.internjava.practice2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Crockery extends Goods {
    private String manufacturer;
    private LocalDate arrivalDate;

    public Crockery(String productCode, String name, int quantity, double unitPrice,
                    String manufacturer, LocalDate arrivalDate) {
        super(productCode, name, quantity, unitPrice);
        this.manufacturer = manufacturer;
        this.arrivalDate = arrivalDate;
    }

    @Override
    public double getVAT() {
        return 0.10;
    }

    @Override
    public String evaluateConsumption() {
        long daysStored = ChronoUnit.DAYS.between(arrivalDate, LocalDate.now());
        if (quantity > 50 && daysStored > 10) {
            return "Slow-selling";
        }
        return "Normal";
    }

    @Override
    public void displayInfo() {
        System.out.println("Crockery:");
        super.displayInfo();
        System.out.println("Manufacturer: " + manufacturer + " | Arrival: " + arrivalDate);
        System.out.println("VAT: " + (getVAT() * 100) + "%");
        System.out.println("Evaluation: " + evaluateConsumption());
        System.out.println();
    }
}
