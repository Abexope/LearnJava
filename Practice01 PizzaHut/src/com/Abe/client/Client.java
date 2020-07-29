package com.Abe.client;
import com.Abe.pizza.Pizza;
import com.Abe.pizza.PizzaHut;

import java.util.Scanner;

/**
 * 客户端模块
 *      展示披萨种类
 *      提供`披萨选择输入`
 *      根据用户选择披萨种类提供相应的`披萨属性输入`
 *      根据用户的输入调取pizza制作模块实例化披萨对象返回，并展示披萨的各项属性
 */


public class Client {

    // properties
    public int type;
    public int pizzaSize;
    public int pizzaPrice;
    public int baconGram;
    public String fruitList;
    private PizzaHut pizzaHut = new PizzaHut();      // 披萨工厂

    // constructor
    public Client() {}

    public PizzaHut getPizzaHut() {
        return pizzaHut;
    }

    public void setPizzaHut(PizzaHut pizzaHut) {
        this.pizzaHut = pizzaHut;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public int getBaconGram() {
        return baconGram;
    }

    public void setBaconGram(int baconGram) {
        this.baconGram = baconGram;
    }

    public String getFruitList() {
        return fruitList;
    }

    public void setFruitList(String fruitList) {
        this.fruitList = fruitList;
    }

    public void welcomeWindow() {

        // 接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择想要制作的披萨 [1.培根披萨 2.水果披萨]: ");
        this.setType(sc.nextInt());

        switch (type) {
            case 1: {
                System.out.print("请输入培根的克数: ");
                this.setBaconGram(sc.nextInt());
                System.out.print("请输入披萨的大小: ");
                this.setPizzaSize(sc.nextInt());
                System.out.print("请输入披萨的价格: ");
                this.setPizzaPrice(sc.nextInt());
                break;
            }
            case 2: {
                System.out.print("请输入想要加入的水果: ");
                this.setFruitList(sc.next());
                System.out.print("请输入披萨的大小: ");
                this.setPizzaSize(sc.nextInt());
                System.out.print("请输入披萨的价格: ");
                this.setPizzaPrice(sc.nextInt());
                break;
            }
            default: {
                break;
            }
        }

        // 将客户端收集的参数传递给 PizzaHut 工厂，工厂根据输入返回相应的 pizza 对象
        Pizza pizza = pizzaHut.getPizza(this);

        // 输出 pizza 信息
        System.out.println(pizza);
    }

}
