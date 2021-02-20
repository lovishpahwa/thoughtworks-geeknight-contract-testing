package com.example.retailer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class Controller {

  @GetMapping("/retailer-details")
  public RetailerDetail getRetailerDetail(){
    return new RetailerDetail("Parle", "Food");
  }

  @GetMapping("/price")
  public Price getString(){
    return new Price(1000, "Rupee");
  }

}
