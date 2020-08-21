package com.Abe01.Stream;

import java.util.stream.Stream;



public abstract class Demo02CommonMethods {
}


/**
 *  forEach()方法
 *      用来遍历 Stream 对象中的数据
 *      终结方法，不可链式调用
 */
class Demo02forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(System.out::println);
    }
}


/**
 *  filter() 方法
 *      过滤 Stream 对象
 *      延迟方法，方法返回结果仍是一个 Stream 流对象，仍可继续调用 Stream 对象的其它方法
 */
class Demo02filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "周芷若", "张无忌");
        stream.filter((name)->name.startsWith("张")).forEach(System.out::println);
    }
}


/**
 *  map() 方法
 *      将流中的元素以某种形式映射到另一个流中
 *      延迟方法
 */

class Demo02map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        stream.map(Integer::parseInt).forEach(System.out::println);
    }
}


/**
 *  count() 方法
 *      元素计数，返回long类型
 *      终结方法
 */

class Demo02count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        System.out.println((int) stream.count());
    }
}


/**
 *  limit() 方法
 *      取用前几个
 *      延迟方法
 */

class Demo02limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        stream.limit(2).forEach(System.out::println);
    }
}


/**
 *  skip() 方法
 *      跳过前几个
 *      延迟方法
 */

class Demo02skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        stream.skip(2).forEach(System.out::println);
    }
}


/**
 *  concat() 方法
 *      组合两个流
 *      静态方法
 */

class Demo02concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "周芷若", "张无忌");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4");
        Stream.concat(stream1, stream2).forEach(System.out::println);

        stream1 = Stream.of("张三丰", "张翠山", "周芷若", "张无忌");
        stream2 = Stream.of("1", "2", "3", "4");
        Stream<String> newStream = Stream.concat(stream1, stream2);
        System.out.println((int) newStream.count());
    }
}





