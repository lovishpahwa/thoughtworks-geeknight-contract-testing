package com.example.buyer_two.core;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuyerTwoService {
    public RetailerDetail getRetailerDetail() {
        return new RestTemplate().getForObject("http://localhost:8088/retailer-details", RetailerDetail.class);
    }
}
