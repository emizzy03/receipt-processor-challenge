package com.example.receipts.service;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.receipts.model.Receipt;
@Service
public class ReceiptService {
   private final Map<String, Receipt> receipts = new HashMap<>();
  

    public String addReceipt(Receipt receipt) {
        String receiptId = UUID.randomUUID().toString();
        receipts.put(receiptId, receipt);
        return receiptId;
    }

    public Receipt getReceipt(String receiptId) {
        return receipts.get(receiptId);
    }
    
}
