package com.example.retailer;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
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

  @GetMapping("/vodqa_shot")
  public String getString(){
    return "\"contract test for second consumer\"";
  }

}
