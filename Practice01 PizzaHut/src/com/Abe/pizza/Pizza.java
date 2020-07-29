package com.Abe.pizza;

/**
 * Pizza模块
 *      定义 Pizza 的抽象类作为模板
 *          分别定义`培根披萨`和`水果披萨`类，共同继承模板类
 *          通过 PizzaHut 工厂类实现多态实例化
 */


public abstract class Pizza {

    // properties
    private int size = 7;       // 披萨尺寸
    private int price = 78;     // 披萨价格

    // constructor
    public Pizza() {}

    public Pizza(int size, int price) {
        this.setSize(size);
        this.setPrice(price);
    }

    // methods
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("输入非法，已采用默认值");
            this.size = 7;      // 默认值为7寸
        }
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("输入非法，已采用默认值");
            this.price = 78;    // 默认价格为78
        }
    }

    // 披萨可视化方法
    public abstract String toString();

}


final class BaconPizza extends Pizza {

    // properties
    final String name = "培根披萨";
    private int baconGram = 10;      // 培根克数，默认10克

    // constructor
    public BaconPizza() {}

    public BaconPizza(int size, int price, int baconGram) {
        super(size, price);
        this.setBaconGram(baconGram);
    }

    // methods
    public int getBaconGram() {
        return baconGram;
    }

    public void setBaconGram(int baconGram) {
        if (baconGram > 0) {
            this.baconGram = baconGram;
        } else {
            System.out.println("输入非法，已采用默认值");
            this.baconGram = 20;    // 20克
        }
    }

    @Override
    public String toString() {
        return "名称：" + this.name +
                "\n价格：" + this.getPrice() +
                "元\n大小：" + this.getSize() +
                "寸\n培根克数：" + this.getBaconGram() + "g\n";
    }

}


final class FruitPizza extends Pizza {

    // properties
    final String name = "水果披萨";
    private String fruitList = "菠萝";    // 默认选项：菠萝

    // constructor
    public FruitPizza() {}

    public FruitPizza(int size, int price, String fruitList) {
        super(size, price);
        this.setFruitList(fruitList);
    }

    public String getFruitList() {
        return fruitList;
    }

    public void setFruitList(String fruitList) {
        this.fruitList = fruitList;
    }

    @Override
    public String toString() {
        return "名称：" + this.name +
                "\n价格：" + this.getPrice() +
                "元\n大小：" + this.getSize() +
                "寸\n配料水果：" + this.fruitList;
    }
}
