package RedPackage;

import java.util.ArrayList;
import java.util.Random;

public abstract class User {
    /* 用户类 */

    private String name;    // 姓名
    private int money;      // 余额

    public User() { }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}


class Manager extends User {
    /* 群主类 */

    public Manager() { }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {     // 发红包
        // 红包初始化，使用ArrayList对象实现
        ArrayList<Integer> redPackage = new ArrayList<>();
        int leftMoney = this.getMoney();

        // 余额检查
        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redPackage;
        }

        // 扣钱，即重新设置余额
        this.setMoney(leftMoney - totalMoney);

        // 发红包需要拆成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;   // 余数放在最后一个红包

        // 装红包
        for (int i = 0; i < count-1; i++) {
            redPackage.add(avg);
        }
        redPackage.add(avg + mod);  // 装最后一个红包

        return redPackage;
    }
}


class Member extends User {
    /* 会员类 */

    public Member() { }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中随机抽取一个
        int index = new Random().nextInt(list.size());

        // 红包集合中删除当前选中的红包，提取红包金额
        int delta = list.remove(index);

        // 获取当前自己的余额
        int money = this.getMoney();

        // 将当前余额与红包金额相加后更新自己的余额
        this.setMoney(money + delta);
    }
}