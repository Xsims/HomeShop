package com.cursan.homeshop;

public class ExpressDelivery implements Delivery {
    public ExpressDelivery(String address) {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}
