package com.example.buyer_one.core;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuyerOneService {
    public Item getItemDetail() {
        return new RestTemplate().getForObject("http://localhost:8088/item/1009", Item.class);
    }
}
