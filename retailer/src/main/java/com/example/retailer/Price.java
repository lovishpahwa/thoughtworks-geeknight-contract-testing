package com.example.retailer;

public class Price {
    private  Integer value;
    private String currency;

    public Price(Integer value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Integer getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
