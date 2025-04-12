package com.example.receipts.model;

public class Item {
    public String shortDescription;
    public Double price;

    public Item(String shortDescription, Double price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Double getPrice() {
        return price;
    }
}
