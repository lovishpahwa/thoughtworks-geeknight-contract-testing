package com.tw.geeknight.manufacturer.product;

public class Product {
    private String name;
    private String des;

    public Product(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }
}
