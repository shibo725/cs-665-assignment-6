package org.example;

import java.util.logging.Logger;

public class TaxiDriver implements Driver {
    private static final Logger logger = Logger.getLogger(TaxiDriver.class.getName());
    private String name;

    public TaxiDriver(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Driver name cannot be null or empty");
        }
        this.name = name;
    }

    @Override
    public void update(DeliveryRequest request) {
        if (request != null) {
            logger.info("TaxiDriver " + name + " notified of delivery: " + request);
        }
    }
}
