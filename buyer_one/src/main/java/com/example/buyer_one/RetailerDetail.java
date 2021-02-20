package com.example.buyer_one;

public class RetailerDetail {
    private String name;
    private String type;

    public RetailerDetail() {
        super();
    }

    public RetailerDetail(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
