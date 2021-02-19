package com.tw.geeknight.buyer.query;

public class PriceStructure {
    private Integer minPrice;
    private Integer maxPrice;
    private String serviceType;

    public PriceStructure() {
        super();
    }

    public PriceStructure(Integer minPrice, Integer maxPrice, String serviceType) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.serviceType = serviceType;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setServiceType(String serviceType) {
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
