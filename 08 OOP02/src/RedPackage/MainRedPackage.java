package RedPackage;

import java.util.ArrayList;

/**
 * 继承与抽象类的案例：红包群
 */


public class MainRedPackage {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member memberA = new Member("成员A", 0);
        Member memberB = new Member("成员B", 0);
        Member memberC = new Member("成员C", 0);

        System.out.println(manager);
        System.out.println(memberA);
        System.out.println(memberB);
        System.out.println(memberC);

        System.out.println("=============");

        ArrayList<Integer> redPackage = manager.send(20, 3);
        memberA.receive(redPackage);
        memberB.receive(redPackage);
        memberC.receive(redPackage);

        System.out.println("抢红包后");
        System.out.println(manager);
        System.out.println(memberA);
        System.out.println(memberB);
        System.out.println(memberC);

    }
}
