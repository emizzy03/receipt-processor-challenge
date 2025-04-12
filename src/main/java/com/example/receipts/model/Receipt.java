package com.example.receipts.model;

import java.util.List;

public class Receipt {

    public String receiptId;
    public String retailer;
    public String  purchaseDate;
    public String purchaseTime;
    public Double total;
    public List<Item> items;

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
