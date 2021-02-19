package com.tw.geeknight.manufacturer.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
    @GetMapping("/api/product")
    public Product getProduct() {
        return new Product("Parle-G", "G for genius");
    }
}
