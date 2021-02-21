package com.example.retailer.pacts.provider;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import au.com.dius.pact.provider.junit.Consumer;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import au.com.dius.pact.provider.spring.target.SpringBootHttpTarget;
import com.example.retailer.RetailerApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@RunWith(SpringRestPactRunner.class)
@SpringBootTest(classes = RetailerApplication.class, webEnvironment = RANDOM_PORT, properties = "server.port=80")
@Provider("retailer")
@Consumer("buyer_one")
@PactBroker(host = "localhost",port = "9292")
@ActiveProfiles("test")
public class BuyerOneContractTests {

  @TestTarget
  public Target target = new SpringBootHttpTarget();

  @State("Get item details")
  public void testBuyerOneContract(){

  }
}
