/**
 * 数组应用：插入删除元素
 */

public class TestArray07 {

    public static void insert(int[] arr, int index, int value) {
        // 向数组中插入元素
        if (index >= arr.length) {
            System.out.println("索引超出合法范围，程序终止");
        } else {
            for (int i = arr.length-1; i > index; i --) {
                arr[i] = arr[i-1];
            }
            arr[index] = value;
        }
    }

    public static void insertA(int[] arr, int index, int value) {
        // 向数组中插入元素
        if (index >= arr.length) {
            System.out.println("索引超出合法范围，程序终止");
        } else {
            if (arr.length - 1 - index >= 0) {
                // Java自动提供的数组内批量元素覆盖方法
                System.arraycopy(arr, index, arr, index + 1, arr.length - 1 - index);
            }
            arr[index] = value;
        }
    }

    public static void main(String[] args) {
        int [] arr = {12, 3, 56, 7, 3, 10};
        insertA(arr, 3, -1);
        for (int v: arr) {
            System.out.print(v + "\t");
        }
        System.out.println();
    }
}


class TestArray08 {

    public static int pop(int[] arr, int index) {
        // 根据数组索引删除元素
        if (index < 0 || index >= arr.length) {
            System.out.println("索引值非法，程序退出");
            return -1;
        }
        int val = arr[index];
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return val;
    }

    public static int popA(int[] arr, int index) {
        // 根据数组索引删除元素
        if (index < 0 || index >= arr.length) {
            System.out.println("索引值非法，程序退出");
            return -1;
        }
        int val = arr[index];
        if (arr.length - 1 - index >= 0)
            System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index);
        arr[arr.length-1] = 0;
        return val;
    }

    public static void remove(int[] arr, int value) {
        // 删除数组中第一个出现value的元素
        int index = -1;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("数组中没有元素" + value + "，程序终止");
        } else {
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
    }

    public static void removeA(int[] arr, int value) {
        // 删除数组中第一个出现value的元素
        int index = -1;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("数组中没有元素" + value + "，程序终止");
        } else {
            if (arr.length - 1 - index >= 0)
                System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index);
            arr[arr.length - 1] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 7, 3, 10};

        System.out.println(popA(arr, 1));
        removeA(arr, 666);

        // 打印更新后的数组
        for (int v: arr) {
            System.out.print(v + "\t");
        }
        System.out.println();


    }
}
