package com.tw.geeknight.buyer.contract;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.PactDslRootValue;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tw.geeknight.buyer.query.PriceStructure;
import com.tw.geeknight.buyer.query.QueryService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetailerContractTests {
    private static final String HOST_NAME = "localhost";
    private static final int PORT = 4000;
    @Rule
    public PactProviderRuleMk2 mockProvider = new PactProviderRuleMk2("retailer",
            HOST_NAME, PORT, this);
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private QueryService queryService;

    @Pact(consumer = "buyer")
    public RequestResponsePact createPactForGetLastUpdatedTimestamp(PactDslWithProvider builder) {

        PriceStructure priceStructure = new PriceStructure(100, 1000, "Vehicle");

        PactDslRootValue pactDslResponse = new PactDslRootValue();
        pactDslResponse.setValue(priceStructure);

        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        return builder
                .given("test GET lastUpdatedTimestamp")
                .uponReceiving("GET request for datetime")
                .path("/api/price-structure")
                .method("GET")
                .willRespondWith()
                .status(200)
                .headers(headers)
                .body(pactDslResponse.asBody())
                .toPact();
    }

    @Test
    @PactVerification(value = "retailer", fragment = "createPactFileForRetailerResponse")
    public void testConsumerGetRequestToOffsetService() {
        PriceStructure priceStructure = queryService.getPriceStructure();


        System.out.println(priceStructure.getMinPrice());

//        assertThat(priceStructure.getMinPrice().getClass(), instanceOf(String.class));
//        assertThat(priceStructure.getMaxPrice().getClass(), instanceOf(String.class));
//        assertThat(priceStructure.getServiceType().getClass(), instanceOf(String.class));
    }
}
