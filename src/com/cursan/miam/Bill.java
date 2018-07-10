package com.cursan.miam;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;

    public Bill(Customer customer){
        this.customer = customer;
    }

    public void addProduct(Product product, Integer quantity){
        products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
