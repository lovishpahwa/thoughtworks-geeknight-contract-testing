package com.tw.geeknight.buyer.query;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QueryService {
    @GetMapping("/api/price-structure")
    public PriceStructure getPriceStructure() {
        return new RestTemplate().getForObject("http://localhost:4000/api/price-structure", PriceStructure.class);
    }
}