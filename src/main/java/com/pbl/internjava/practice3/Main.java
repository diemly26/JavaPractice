package com.pbl.internjava.practice3;

public class Main {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        Owner o1 = new Owner("066304014108", "Nguyen Nhat Minh", "nminh@gmail.com");
        Owner o2 = new Owner("049304014108", "Tran Thanh Nha", "tnha@gmail.com");

        Vehicle car1 = new Car("A0099", "Porsche", 2022, "White", o1, 5, "Petrol");
        Vehicle bike1 = new Motorbike("B1123", "Bentley", 2021, "Blue", o2, 150);
        Vehicle truck1 = new Truck("A1111", "Volvo", 2023, "White", o1, 3.5);

        manager.addVehicle(car1);
        manager.addVehicle(bike1);
        manager.addVehicle(truck1);

        manager.displayAll();

        System.out.println("\nSearch by number B1123:");
        System.out.println(manager.searchByNumber("B1123"));

        System.out.println("\nFind vehicles of owner 066304014108:");
        manager.findByOwner("066304014108").forEach(System.out::println);

        System.out.println("\nTop manufacturer: " + manager.findTopManufacturer());

        manager.statisticsByType();
    }
}

