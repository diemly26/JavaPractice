package com.pbl.internjava.practice3;

import java.time.Year;

public abstract class Vehicle {
    protected String vehicleNumber;
    protected String manufacturer;
    protected int year;
    protected String color;
    protected Owner owner;

    public Vehicle(String vehicleNumber, String manufacturer, int year, String color, Owner owner) {
        if (vehicleNumber.length() != 5) {
            throw new IllegalArgumentException("Vehicle number must have exactly 5 characters!");
        }
        if (!(manufacturer.equals("Bentley") || manufacturer.equals("Porsche") ||
                manufacturer.equals("Toyota") || manufacturer.equals("Volvo"))) {
            throw new IllegalArgumentException("Manufacturer must be Bentley, Porsche, Toyota, or Volvo!");
        }
        int currentYear = Year.now().getValue();
        if (year < 2000 || year > currentYear) {
            throw new IllegalArgumentException("Invalid manufacture year!");
        }
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Owner getOwner() {
        return owner;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] " + vehicleNumber + " - " + manufacturer + " (" + year + "), " + color +
                " | Owner: " + owner;
    }
}
