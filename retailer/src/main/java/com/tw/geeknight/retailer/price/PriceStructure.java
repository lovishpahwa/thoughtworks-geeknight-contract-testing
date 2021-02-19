package com.tw.geeknight.retailer.price;

public class PriceStructure {
    private Integer minPrice;
    private Integer maxPrice;
    private String serviceType;

    public PriceStructure(Integer minPrice, Integer maxPrice, String serviceType) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.serviceType = serviceType;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public String getServiceType() {
        return serviceType;
    }
}
