package com.Abe.pizza;

import com.Abe.client.Client;

/**
 * 披萨工厂
 *      根据 Client 对象传入的参数实例化并返回相应的 pizza 对象
 */


final public class PizzaHut {

    // properties
    private Pizza pizza;        // 披萨

    // constructor
    public PizzaHut() {}

    // methods
    private Pizza getBaconPizza(int size, int price, int baconGram) {
        /* 培根披萨生产方法
            int baconGram: 培根克数
            int price: 价格
            int size: 尺寸
        * */
        pizza = new BaconPizza(size, price, baconGram);
        return pizza;
    }

    private Pizza getFruitPizza(int size, int price, String fruitList) {
        /* 水果披萨生产方法
            String fruitList: 水果种类
            int price: 价格
            int size: 尺寸
        * */
        pizza = new FruitPizza(size, price, fruitList);
        return pizza;
    }

    private Pizza getDefaultPizza() {
        return new BaconPizza();
    }

    public Pizza getPizza(Client client) {
        /* 披萨生产方法
            Client client: 客户端对象，包含用户输入的购买信息
        * */
        switch (client.getType()) {
            case 1: {
                return getBaconPizza(client.getPizzaSize(), client.getPizzaPrice(), client.getBaconGram());
            }
            case 2: {
                return getFruitPizza(client.getPizzaSize(), client.getPizzaPrice(), client.getFruitList());
            }
            default: {
                return getDefaultPizza();    // 缺省情况，返回一个默认属性的培根披萨
            }
        }
    }

}
