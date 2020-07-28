package com.Abe.test09;

/**
 * 重写 Object 类中的 equals() 方法
 */


public class Phone {

    // properties
    private String brand;       // 品牌
    private double price;       // 价格
    private int year;           // 出产年份

    // Constructors
    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    // methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

//    public boolean equals(Phone obj) {      // 重载方法
//        return (this.getBrand().equals(obj.getBrand())) && (this.getPrice() == obj.getPrice()) && (this.getYear() == obj.getYear());
//    }

    @Override
    public boolean equals(Object obj) {     // 重写方法
        if (this == obj)                // 两个指针指向同一个地址，直接返回true
            return true;
        if (!(obj instanceof Phone))    // instanceof：判断obj是否是Phone类的一个实例
            return false;
        Phone other = (Phone) obj;       // 将obj转为Phone类型
        return (Double.compare(this.getPrice(), other.getPrice())==0) &&       // 自动化生成的浮点数比较方法，通常，浮点数之间比较容易出现差异，因此优先比较
                (this.getBrand().equals(other.getBrand())) &&
//                (this.getPrice()==other.getPrice()) &&
                (this.getYear()==other.getYear());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Phone)) return false;
//        Phone phone = (Phone) o;
//        return Double.compare(phone.getPrice(), getPrice()) == 0 &&
//                getYear() == phone.getYear() &&
//                getBrand().equals(phone.getBrand());
//    }

}
