package com.example.receipts.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.receipts.model.Receipt;
import com.example.receipts.service.PointsCalculationService;
import com.example.receipts.service.ReceiptService;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;
    @Autowired
    private PointsCalculationService pointsCalculationService;

    @PostMapping("/process")
    public ResponseEntity<Map<String, String>> processReceipt(@RequestBody Receipt receipt) {
        //A JSON object containing the receiptId
        Map<String, String> response = new HashMap<>();
        response.put("Id", receiptService.CreateReceiptID(receipt));
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/{id}/points")
    public ResponseEntity<Map<String, Integer>> getPoints(@PathVariable(value = "id") String id) {
        //A JSON object containing the points awarded
        Map<String, Integer> response = new HashMap<>();

        Receipt receipt = receiptService.getReceipt(id);

        if (receipt == null) {
            return ResponseEntity.status(404).body(response);
        }

        response.put("points", pointsCalculationService.calculations(receipt));
        return ResponseEntity.status(200).body(response);

    }
}
