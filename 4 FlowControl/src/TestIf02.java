/**
 * if 多分支
 */

public class TestIf02{
    public static void main(String[] args){
        //实现一个功能：给出三个数（1-6），对三个数求和计算，根据和的大小来分配不同的奖品
        //1.给出三个数：
        int num1 = 6;
        int num2 = 4;
        int num3 = 2;
        //2.求和
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        System.out.println("和为："+sum);

        //3.根据和判断奖品：
                /*
                利用一个多分支
                【1】结构：
                if(){

                }else if(){

                }else if(){

                }...
                else{

                }
                【2】else:隐藏了一个条件，跟上面分支条件表达式相反的功能 (详见数轴分析)
                【3】多分支：好处：只要满足一个 分支以后，后面的分支就不需要判断了 --》效率高
                【4】我们写代码的时候，尽量保证else的存在--》else分支相当于“兜底”“备胎”的作用，别的分支都不走，就会走这个分支了
                */
        if(sum>=14){
            System.out.println("一等奖");
        }else if(sum>=10){//隐藏了sum<14
            System.out.println("二等奖");
        }else if(sum>=6){//隐藏了sum<10
            System.out.println("三等奖");
        }else{//隐藏了sum<6
            System.out.println("四等奖");
        }
    }
}