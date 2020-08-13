import java.util.Scanner;

/**
 * 自定义异常类练习：
 *      模拟注册操作，如果用户名已存在，则抛出 RegisterException 异常并提示：`亲，该用户名已被注册`
 *
 *  分析：
 *      1.使用数组保存已经注册过的用户名（实际开发中会保存在数据库中）
 *      2.使用 Scanner 获取用户输入注册名（实际开发时会提供前端页面实现）
 *      3.定义一个方法对用户输入的注册用户名进行判断：
 *          遍历已注册用户名数组，并和当前输入的用户名做对比（.equals）
 *          true:
 *              用户名已存在，抛出 RegisterException 异常
 *          false:
 *              继续遍历
 *          循环结束了，没有找到重复名，打印`注册成功`
 */

public class Test01SelfDefineException {

    // 1.使用数组保存已经注册过的用户名
    static String[] userNames = {"张三", "李四", "王五"};

    public static void main(String[] args) /*throws RegisterException*/ {
        // 2.使用 Scanner 获取用户输入注册名
        Scanner sc = new Scanner(System.in);
        System.out.print("注册用户名：");
        String userName = sc.next();
        checkUserNames(userName);
    }

    // 3.定义一个方法对用户输入的注册用户名进行判断
    public static void checkUserNames(String userName) /*throws RegisterException*/ {
        // 遍历已注册用户名数组，并和当前输入的用户名做对比（.equals）
        for (String name : userNames) {
            if (name.equals(userName)) {
                // true: 用户名已存在，抛出 RegisterException 异常
                throw new RegisterException("亲，该用户名已被注册");  // 运行期异常无需自行处理，交给JVM
//                try {
//                    throw new RegisterException("亲，该用户名已被注册");
//                } catch (RegisterException e) {
//                    e.printStackTrace();
//                    return;     // 抛出异常的同时结束方法执行
//                }
            }
        }
        // 循环结束了，没有找到重复名，打印`注册成功`
        System.out.println("注册成功");
    }

}


