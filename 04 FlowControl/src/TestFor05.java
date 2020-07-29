/**
 * continue 语句
 */


public class TestFor05 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i+=6){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 100; i++){
            if (i % 6 != 0) continue;   // continue语句，结束本层的本轮循环
            System.out.print(i + " ");
        }
        System.out.println();

        //循环标签
        loop: for (int i = 0; i <= 100; i ++) {
            while (i % 6 != 0) {
                i += 0;
                continue loop;      // 继续 loop 层的循环
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


class TestFor06{
    public static void main(String[] args){
        //continue:结束本次离它近的循环，继续下一次循环
                /*
                for(int i=1;i<=100;i++){
                        if(i==36){
                                continue;//1-100中间没有36
                        }
                        System.out.println(i);
                }
                */

        for(int i=1;i<=100;i++){
            while(i==36){
                System.out.println("------");
                continue; //1-35+死循环
            }
            System.out.println(i);
        }
    }
}


class TestFor07{
    public static void main(String[] args){

        outer:
        for(int i=1;i<=100;i++){
            while(i==36){
                continue outer;  //1-100没有36
            }
            System.out.println(i);
        }
    }
}
