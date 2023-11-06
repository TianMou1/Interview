package com.tianmou.Bean;

public class Fruit {
    // 水果名
    private String name;

    // 水果价格
    private double price;

    // 水果总价格
    private double totalPrice;

    // 水果斤数
    private double cattyCount;

    public Fruit(String name, double price, double cattyCount) {
        this.name = name;
        this.price = price;
        this.cattyCount = cattyCount;
        this.totalPrice = cattyCount * price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // 总价格随着单价的变化而变化
        this.totalPrice *= (price / this.price);
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setCattyCount(double cattyCount) {
        this.totalPrice = cattyCount * this.price;
        this.cattyCount = cattyCount;
    }
}
