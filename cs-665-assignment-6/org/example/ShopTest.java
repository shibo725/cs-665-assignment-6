package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testDeliveryNotification() {
        Shop shop = new Shop();
        Driver driver1 = new TaxiDriver("Dixi");
        Driver driver2 = new TaxiDriver("Lala");
        Driver driver3 = new TaxiDriver("Aaaa");
        Driver driver4 = new TaxiDriver("Bbbb");
        Driver driver5 = new TaxiDriver("Cccc");

        // Register drivers
        shop.registerDriver(driver1);
        shop.registerDriver(driver2);
        shop.registerDriver(driver3);
        shop.registerDriver(driver4);
        shop.registerDriver(driver5);

        // Verify initial state
        assertEquals(5, shop.getDrivers().size());

        // Notify drivers of a delivery request
        DeliveryRequest request = new DeliveryRequest("Pizza", "9 Gardner st");
        shop.notifyDrivers(request);

        // Ensure the request details are logged (mock logger in real tests)
        // Mocking framework like Mockito would verify this in production
    }
}