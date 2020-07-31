package com.Abe.client;

import juice.Juice;
import juice.JuiceClub;

import java.util.Scanner;

public class Client {
    // 客户端类

    private Indent indent = new Indent();               // 订单对象
    private JuiceClub juiceClub = new JuiceClub();      // 饮料工厂对象
    private Scanner sc = new Scanner(System.in);        // 输入扫描器

    private void getSizeInfo() {
        // 接收杯装信息
        WhileLoop: while (true) {
            System.out.println("选择1.中杯 2.大杯 3.超大杯：");
            int size = this.sc.nextInt();               // 录入杯装信息
            switch (size) {
                case 1: {
                    this.indent.setSize("中杯");
                    break WhileLoop;
                }
                case 2: {
                    this.indent.setSize("大杯");
                    break WhileLoop;
                }
                case 3: {
                    this.indent.setSize("超大杯");
                    break WhileLoop;
                }
                default: {
                    System.out.println("输入无效，请重新输入");
                }
            }
        }
    }

    private void getCokeInfo() {
        // 接收可乐信息
        System.out.println("请录入你需要的可乐信息：");
        System.out.println("备注可口可乐还是百事可乐，是否加冰：");
        String remarks = this.sc.next();    // 录入备注信息
        this.indent.setRemarks(remarks);
    }

    private void getCoffeeInfo() {
        // 接收咖啡信息
        System.out.println("请录入你需要的咖啡信息：");
        System.out.println("备注加奶，加冰，加糖情况：");
        String remarks = this.sc.next();    // 录入备注信息
        this.indent.setRemarks(remarks);
    }

    private void getMilkyTeaInfo() {
        // 接收奶茶信息
        System.out.println("请录入你需要的奶茶信息：");
        System.out.println("备注是否加红豆，椰果，布丁，珍珠：");
        String remarks = this.sc.next();    // 录入备注信息
        this.indent.setRemarks(remarks);
    }

    public void welcomeWindow() {

        // 接收用户输入
        WhileLoop: while (true) {
            System.out.println("请录入你要购买的饮品：1.可乐 2.咖啡 3.奶茶");
            int category = this.sc.nextInt();            // 录入商品品类
            switch (category) {
                case 1: {
                    this.indent.setCategory(category);
                    this.getCokeInfo();
                    break WhileLoop;
                }
                case 2: {
                    this.indent.setCategory(category);
                    this.getCoffeeInfo();
                    break WhileLoop;
                }
                case 3: {
                    this.indent.setCategory(category);
                    this.getMilkyTeaInfo();
                    break WhileLoop;
                }
                default: {
                    System.out.println("输入无效，请重新输入");
                }
            }
        }
        this.getSizeInfo();                 // 录入杯装信息
        System.out.println("购买数量：");
        int count = this.sc.nextInt();      // 录入数量信息
        this.indent.setCount(count);

        // 将订单信息输入至饮料工厂制作饮料
        Juice juices = juiceClub.getJuice(this.indent);

        // 将饮料对象的信息录入订单
        this.indent.setJuices(juices);              // 饮料对象本身

        // 输出订单信息
        System.out.println(this.indent);
    }

}
