/**
 * break 语句
 */


public class TestFor03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 36){
                break;
            }
        }

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            while (i == 36){
//                break;      // break：停止最近的循环
//            }
//        }

    }
}


class TestFor04 {
    // 为多层循环标注循环标签，使break语句实现跳出指定标签的循环体
    public static void main(String[] args) {

        // 循环标签
        loop1: for (int i = 1; i <= 100; i++){
            System.out.println(i);
            while (i == 36){
                break loop1;    // 跳出 loop1 层循环
            }
        }

    }
}


