package com.example.buyer_two;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Slf4j
@Service
public class BuyerTwoService {
    public RetailerDetail getRetailerDetail() {
        return restTemplate().getForObject("http://localhost:8088/retailer-details", RetailerDetail.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
