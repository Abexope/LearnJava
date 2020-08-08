package InnerClass01;

public class Body {     // 外部类

    public class Heart {    // 成员内部类

        // 内部类方法
        public void beat() {
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我叫：" + name);   // OK!
        }

    }

    private String name;

    // 外部类方法
    public void methodBody() {
        System.out.println("外部类方法");

        // 外部类实例化成员内部类，并调用成员内部类的方法
        Heart heart = new Heart();
        heart.beat();
        // new Heart().beat();     // 匿名对象，OK
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
