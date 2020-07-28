/**
 * return 语句
 */


public class TestFor08{
    public static void main(String[] args){
        //return:遇到return结束当前正在执行的方法
        for(int i=1;i<=100;i++){
            while(i==36){
                return;
            }
            System.out.println(i);
        }

        System.out.println("-----");
    }
}