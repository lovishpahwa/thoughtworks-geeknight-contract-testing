package com.tw.geeknight.retailer.price;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
    @GetMapping("/api/price-structure")
    public PriceStructure getProducts() {
        return new PriceStructure(100, 3000, "Vehicle");
    }
}
