/**
 * 数组应用：查找
 */

public class TestArray05 {

    public static int binarySearch(int num, int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (num > arr[mid]) {
                lo = mid + 1;
            } else if (num < arr[mid]) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 查找
//        int[] arr = {12,34,56,7,3,56};
        int [] arr = {1, 3, 6, 7, 12, 18};
        System.out.println(binarySearch(3, arr));
        System.out.println(binarySearch(7, arr));
        System.out.println(binarySearch(12, arr));
        System.out.println(binarySearch(18, arr));
        System.out.println(binarySearch(56, arr));
        System.out.println(binarySearch(56, arr));
        System.out.println(binarySearch(4, arr));
        System.out.println(binarySearch(1, arr));
    }
}


class TestArray06{
    public static void main(String[] args){
        //查询指定元素的位置--》找出元素对应的索引
        //给定一个数组：
        int[] arr = {12,34,56,7,3,56};
        //           0  1  2  3 4  5

        //功能：查询元素888对应的索引：
        int index = -1; //这个初始值只要不是数组的索引即可
        for(int i=0;i<arr.length;i++){
            if(arr[i]==12){
                index = i;//只要找到了元素，那么index就变成为i
                break;//只要找到这个元素，循环就停止
            }
        }
        if(index!=-1){
            System.out.println("元素对应的索引："+index);
        }else{//index==-1
            System.out.println("查无次数！");
        }
    }
}
