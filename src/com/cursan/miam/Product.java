package com.cursan.miam;

public class Product {

    String name;
    String description;
    double price;

    public Product(){
        name = "Inconnu";
        description = "Pas de description";
        price = 0.0d;
    }

    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void look(){
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public void buy(Bill bill, Integer quantity){
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public String getDescripton() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
