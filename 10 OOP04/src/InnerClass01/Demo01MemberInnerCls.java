package InnerClass01;

/**
 * 内部类的使用
 */

public class Demo01MemberInnerCls {
    public static void main(String[] args) {

        // 1.间接方式：通过外部类的对象，调用外部类方法，外部类方法中间接使用内部类
        Body body = new Body();
        body.methodBody();

        System.out.println("=======");

        // 2.直接方式：[外部类名称].[内部类名称] [对象名] = new [外部类名称]().new [内部类名称]();
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
