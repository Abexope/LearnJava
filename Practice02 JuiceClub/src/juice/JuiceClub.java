package juice;

import com.Abe.client.Indent;


public class JuiceClub {
    // 饮品工厂类

    public JuiceClub() {}

    private Juice getCoke(String size, int count, String remarks) {
        /* 可乐生产方法
            String size: 杯装
            int price: 价格
            int count: 数量
            String remarks: 备注信息
        * */
        return new Coke(size, count, remarks);
    }

    private Juice getCoffee(String size, int count, String remarks) {
        /* 咖啡生产方法
            String size: 杯装
            int price: 价格
            String remarks: 备注信息
        * */
        return new Coffee(size, count, remarks);
    }

    private Juice getMilkyTea(String size, int count, String remarks) {
        /* 奶茶生产方法
            String size: 杯装
            int price: 价格
            String remarks: 备注信息
        * */
        return new MilkyTea(size, count, remarks);
    }

    public Juice getJuice(Indent indent) {
        /* 饮料生产方法
            Indent indent: 订单信息
        * */
        Juice juices;
        switch (indent.getCategory()) {      // 根据输入品类执行不同的流程
            case 1: {   // 可乐
                juices = getCoke(indent.getSize(), indent.getCount(), indent.getRemarks());
                break;
            }
            case 2: {   // 咖啡
                juices = getCoffee(indent.getSize(), indent.getCount(), indent.getRemarks());
                break;
            }
            case 3: {   // 奶茶
                juices = getMilkyTea(indent.getSize(), indent.getCount(), indent.getRemarks());
                break;
            }
            default: juices = null;     // 缺省情况，什么都不返回
        }
        return juices;
    }

}
