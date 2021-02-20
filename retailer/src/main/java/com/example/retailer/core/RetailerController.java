package com.example.retailer.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetailerController {

    @Autowired
    private RetailerService retailerService;

    @GetMapping("/item/:id")
    public Item getItemDetails(@RequestParam(value = "id") String itemId) {
        return retailerService.getItemDetails(itemId);
    }

    @GetMapping("/order/:id")
    public Order getOrderDetails(@RequestParam(value = "id") String orderId) {
        return retailerService.getOrderDetails(orderId);
    }

}
