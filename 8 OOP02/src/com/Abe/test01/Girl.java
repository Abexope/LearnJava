package com.Abe.test01;

/**
 * 封装
 *      使用private修饰成员变量，避免成员变量被直接访问
 *      仅提供对外读取和写入的接口
 */

public class Girl {

    // 属性
    private int age;
    private int id;
    private String name;
    private double height;

    // Alt + INSERT 自动添加 setter getter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 读取年龄方法
    public int getAge() {
        return this.age;
    }

    // 设置年龄方法
    public void setAge(int age) {
        if (age >= 30) {        // 自定义封装属性
            this.age = 18;
        } else {
            this.age = age;
        }
    }

}
