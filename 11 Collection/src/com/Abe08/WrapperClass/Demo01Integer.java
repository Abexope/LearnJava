package com.Abe08.WrapperClass;

/**
    包装类
    装箱：将基本数据类型包装到包装类中（基本数据类型 -> 包装类）
        构造方法：
            Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值
                传递的字符串必须是基本类型的字符串，否则回抛出异常，"100" 正确，"a" 异常
        静态方法：
            static Integer valueOf(int i)：返回一个表示指定的 int 值的 Integer 实例
            static Integer valueOf(String s)：返回保存指定 String 的值的 Integer 对象
    拆箱：从包装类中取出基本类型数据（包装类 -> 基本数据类型）
        成员方法：
            int intValue()：以 int 类型返回该 Integer 对象
 */
public class Demo01Integer {
    public static void main(String[] args) {
        // 装箱：将基本数据类型包装到包装类中（基本数据类型 -> 包装类）
        // 构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);    // 1, 重写了 toString() 方法
        Integer in2 = new Integer("1");     // 1
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(1);       // 1
        System.out.println(in3);
        Integer in4 = Integer.valueOf("1");     // 1
        System.out.println(in4);
        // Integer in4_ = Integer.valueOf("a");    // java.lang.NumberFormatException 数字格式转换异常

        // 拆箱：从包装类中取出基本类型数据（包装类 -> 基本数据类型）
        int val = in4.intValue();      // 拆箱
        System.out.println(val);
    }
}
