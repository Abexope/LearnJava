/**
 * 关系运算符：>= <= > < == !=
 */

public class TestOpe08{
    public static void main(String[] args){
        //>，<，>=，<=，==，!=
        //关系运算符最终结果：要么是true要么是false
        System.out.println(4>9);//false
        System.out.println(4<9);//true
        System.out.println(4>=9);//false
        System.out.println(4<=9);//true
        System.out.println(4==9);//false
        System.out.println(4!=9);//true
        System.out.println((5<9)!=(6==8));//true
    }
}