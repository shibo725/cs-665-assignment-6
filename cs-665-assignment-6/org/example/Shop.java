package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Driver> drivers = new ArrayList<>();

    // Register a driver for notifications
    public void registerDriver(Driver driver) {
        if (driver != null && !drivers.contains(driver)) {
            drivers.add(driver);
        }
    }

    // Remove a driver from notifications
    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }

    // Notify all drivers with a delivery request
    public void notifyDrivers(DeliveryRequest request) {
        for (Driver driver : drivers) {
            driver.update(request);
        }
    }

    // Expose registered drivers for testing
    public List<Driver> getDrivers() {
        return new ArrayList<>(drivers); // Return a copy for safety
    }
}

