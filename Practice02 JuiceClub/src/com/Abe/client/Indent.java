package com.Abe.client;

import com.Abe.juice.Juice;


public class Indent {
    // 订单类

    private Juice juices;           // 饮料信息
    private int category;           // 饮料种类
    private String size;            // 杯装
    private int count;              // 数量
    private String remarks;         // 备注信息
    private int price;              // 价格

    public Indent() {}

    public Juice getJuices() {
        return juices;
    }

    public void setJuices(Juice juices) {
        this.juices = juices;
        this.setPrice(juices.getPrice());       // 添加饮料对象的同时，记录对象的价格属性
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        // 生成订单
        return "订单信息：您购买了" + this.getJuices() +
                "，购买的" + this.getSize() +
                "，购买数量" + this.getCount() + "杯" +
                "，价钱：" + this.getPrice() + "*" + this.getCount() +
                "=" + this.getPrice() * this.getCount() + "元";
    }

}
