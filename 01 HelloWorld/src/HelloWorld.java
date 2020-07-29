/**文档注释
 @author Xing Xudong
 这是一个文档注释
 @author Administrator
 @version 0.1.0
 @param age:3
 可以通过 javadoc.exe 对文档注释进行解析，生成一些列HTML文件，其中会有一个 index.html 文件是这些文档的入口
 这些HTML文件在形式上与 JDK API 文档十分类似，也就是说，我们可以通过文档注释来声明自己开发代码的API
 */


public class HelloWorld {
    public static void main(String[] args){
        /*
        一个源文件中可以有多个类，只能有一个类被public修饰，且被public修饰的类名必须与源文件名相同。
        在语法上，类的定义无先后顺序之分
        多行注释
        多行注释
         */
        /*
         *
         */
        System.out.println("Hello World");   // 注释
    }
}


class HelloJava {
    // 不同的类执行有各自的入口
    public static void main(String[] args){     // args：形式参数
        System.out.println("Hello Java");
        System.out.println("Hello JavaSE");
    }
}

