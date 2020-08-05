package com.Abe.juice;


public abstract class Juice {
    // 饮品抽象类，实例化对象时统一从外部传参

    private String remarks;         // 备注
    private String size;            // 杯装   【中杯、大杯、超大杯】 PS：心疼罗老师……
    private int price;              // 价格   根据杯装指定
    private int count;              // 购买数量

    public Juice(String size, int count, String remarks) {
        this.setSize(size);
        this.setCount(count);
        this.setRemarks(remarks);
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public abstract String toString();      // 打印信息类

}


final class Coke extends Juice {
    // 可乐类

    public Coke(String size, int count, String remarks) {
        super(size, count, remarks);
        this.setPrice(10);      // 可乐10元
    }

    public String toString() {
        return "可乐：" + this.getRemarks();
    }

}


final class Coffee extends Juice {
    // 咖啡类

    public Coffee(String size, int count, String remarks) {
        super(size, count, remarks);
        this.setPrice(11);      // 咖啡11元
    }

    public String toString() {
        return "咖啡：" + this.getRemarks();
    }

}


final class MilkyTea extends Juice {
    // 奶茶类

    public MilkyTea(String size, int count, String remarks) {
        super(size, count, remarks);
        this.setPrice(15);      // 奶茶15元
    }

    public String toString() {
        return "奶茶：" + this.getRemarks();
    }

}
