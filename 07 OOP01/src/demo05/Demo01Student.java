package demo05;

/**
 * 使用标准类
 */


public class Demo01Student {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("lalala");
        stu.setAge(20);
        System.out.println(stu.getName() + stu.getAge());

        stu = new Student("lalala2", 21);
        System.out.println(stu.getName() + stu.getAge());

    }

}
