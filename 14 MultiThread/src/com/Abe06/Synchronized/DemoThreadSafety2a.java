package com.Abe06.Synchronized;

/**
 * 解决实现卖票案例中线程安全问题
 *
 * 方案二*：使用静态同步方法
 * 格式：
 *      修饰符 static synchronized 返回值类型 方法名(参数列表) {
 *          // 同步方法体
 *      }
 */
public class DemoThreadSafety2a {
    public static void main(String[] args) {
        Runnable run = new RunnableImpl02a();
        // 启动3条售票线程
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
    }
}

class RunnableImpl02a implements Runnable {

    private static int ticket = 100;

    @Override
    public void run() {
        while (saleTicket()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
        静态同步方法也会将内部代码锁住，只让一个线程执行
        静态同步方法的锁对象是谁? 本类的class属性 --> class文件对象（反射）
     */
    private static synchronized boolean saleTicket() {    // 同步方法
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-->" + "正在卖第 " + ticket + " 张票");
            ticket--;
            return true;
        } else {
            return false;
        }
    }
}