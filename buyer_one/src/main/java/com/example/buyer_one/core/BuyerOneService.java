package com.example.buyer_one.core;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuyerOneService {
    public RetailerDetail getRetailerDetail() {
        return new RestTemplate().getForObject("http://localhost:8088/retailer-details", RetailerDetail.class);
    }
}
