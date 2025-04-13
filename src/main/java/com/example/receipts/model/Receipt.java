package com.example.receipts.model;

import java.util.List;

public class Receipt {

    private String receiptId;
    private String retailer;
    private String purchaseDate;
    private String purchaseTime;
    private Double total;
    private List<Item> items;

    public String getReceiptId() {
        return receiptId;
    }

    public String getRetailer() {
        return retailer;

    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public double getTotal() {
        return total;
    }

    public List<Item> getItems() {
        return items;
    }

}
