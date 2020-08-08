package InnerClass01;

public class Demo02MemberInnerCls {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();    // 成员内部类实例化
        inner.methodInner();
    }
}
