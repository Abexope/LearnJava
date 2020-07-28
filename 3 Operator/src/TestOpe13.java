/**
 * 运算符的优先级
 *      赋值 < 三目 < 逻辑 < 关系 < 算术 < 单目
 *
 * 案例：
 *    5<6 | 'A'>'a' && 12*6<=45+23&&!true
 *  = 5<6 | 'A'>'a' && 12*6<=45+23&&false
 *  = 5<6 | 'A'>'a' &&72<=68&&false
 *  = true|false&&false&&false
 *  = true&&false&&false
 *  = false&&false
 *  = false
 */

public class TestOpe13 {
    public static void main(String[] args) {
        System.out.println(5<6 | 'A'>'a' && 12*6<=45+23&&!true);
    }
}
