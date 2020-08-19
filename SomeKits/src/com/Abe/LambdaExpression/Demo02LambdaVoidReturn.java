package com.Abe.LambdaExpression;

/**
 * 练习：使用Lambda标准格式（无参数无返回值）
 */

public class Demo02LambdaVoidReturn {

    public static void main(String[] args) {
        // TODO：请在此处使用 Lambda【标准格式】调用invokeCook方法
        // 调用invokeCook方法，参数是Cook接口
        invokeCook(
            () -> {
                System.out.println("吃饭了");
            }
        );

        Cls cls = new Cls();
        cls.invokeCookOuter(
                () -> {
                    System.out.println("恰饭啦啦啦啦啦啦啦");
                }
        );
    }

    // 定义一个方法，参数传递Cook 接口，方法内部调用接口方法中的makeFood
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}


interface Cook {
    void makeFood();
}


class Cls {
    public void invokeCookOuter(Cook cook) {
        cook.makeFood();
    }
}

