package demo05;

/**
 * 标准的类定义
 */


public class Student {

    /* 私有成员变量 */
    private String name;    // 姓名
    private int age;        // 年龄

    /* 无参构造方法 */
    public Student() { }

    /* 全参构造方法 */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* 一系列 getter/setter 方法 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
