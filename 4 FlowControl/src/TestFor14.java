/**
 * 打印菱形的新思路：子问题拆分
 */


public class TestFor14 {
    public static void main(String[] args) {
        /*
            打印菱形的新思路：
            视为打印一个正方形，根据不同的位置决定打印 ' ' 还是 '*'
            最终呈现出菱形的效果
            PS：将是否打印和在哪打印拆成两个子问题
         */
        int row = 23;
        int startNum = row/2;   // 起始列号
        int endNum = row/2+1;     // 结束列号

        // 菱形
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j >= startNum && j < endNum) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
            if (i < row/2) {    // 子问题拆分，
                startNum--;
                endNum++;
            } else {
                startNum++;
                endNum--;
            }
        }

        System.out.println();

        // 空心菱形
        startNum = row/2;   // 重置起始列号
        endNum = row/2+1;     // 重置结束列号
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j >= startNum && j < endNum) {
                    if (j == startNum || j == endNum-1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
            if (i < row/2) {    // 子问题拆分
                startNum--;
                endNum++;
            } else {
                startNum++;
                endNum--;
            }
        }
    }
}
