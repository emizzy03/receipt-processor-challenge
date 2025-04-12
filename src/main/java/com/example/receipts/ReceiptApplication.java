package com.example.receipts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ReceiptApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ReceiptApplication.class, args);
    }

}   