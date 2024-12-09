package org.example;

import java.util.Objects;

public class DeliveryRequest {
    private String product;
    private String address;

    public DeliveryRequest(String product, String address) {
        if (product == null || product.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        this.product = product;
        this.address = address;
    }

    public String getProduct() {
        return product;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "DeliveryRequest for " + product + " to " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryRequest that = (DeliveryRequest) o;
        return Objects.equals(product, that.product) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, address);
    }
}
