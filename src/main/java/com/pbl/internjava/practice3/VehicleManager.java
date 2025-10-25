package com.pbl.internjava.practice3;

import java.util.*;

public class VehicleManager {
    private List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle v) {
        for (Vehicle existing : vehicles) {
            if (existing.getVehicleNumber().equals(v.getVehicleNumber())) {
                System.out.println("Duplicate vehicle number!");
                return false;
            }
        }
        vehicles.add(v);
        System.out.println("Added successfully!");
        return true;
    }

    public Vehicle searchByNumber(String number) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleNumber().equalsIgnoreCase(number)) {
                return v;
            }
        }
        return null;
    }

    public List<Vehicle> findByOwner(String idNumber) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getOwner().getIdNumber().equals(idNumber)) {
                result.add(v);
            }
        }
        return result;
    }

    public void deleteByManufacturer(String manufacturer) {
        vehicles.removeIf(v -> v.getManufacturer().equalsIgnoreCase(manufacturer));
        System.out.println("Deleted all vehicles from " + manufacturer);
    }

    public String findTopManufacturer() {
        Map<String, Long> countMap = new HashMap<>();
        for (Vehicle v : vehicles) {
            countMap.put(v.getManufacturer(), countMap.getOrDefault(v.getManufacturer(), 0L) + 1);
        }
        return countMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No data");
    }

    public void sortDescendingByManufacturerCount() {
        vehicles.sort((v1, v2) -> v2.getManufacturer().compareTo(v1.getManufacturer()));
    }

    public void statisticsByType() {
        Map<String, Long> stats = new HashMap<>();
        for (Vehicle v : vehicles) {
            stats.put(v.getType(), stats.getOrDefault(v.getType(), 0L) + 1);
        }
        System.out.println("Statistics by Type");
        stats.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void displayAll() {
        System.out.println("VEHICLE LIST");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}

