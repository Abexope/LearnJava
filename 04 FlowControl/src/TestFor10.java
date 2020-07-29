/**
 * 花样输出
 */


public class TestFor10 {
    public static void main(String[] args) {

        // 输出1-100被5整除的数，每行输出6个
        int col = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                col++;
                if (col % 6 == 0) System.out.println();
            }
        }

    }
}


class TestFor11 {
    public static void main(String[] args) {
        // 输出乘法口诀
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j ++){
                int p = i * j;
                System.out.print(j + "×" + i + "=" + p + "\t");
            }
            System.out.println();
        }
    }
}


class TestFor12 {
    public static void main(String[] args) {
        // 输出倒序乘法口诀
        for (int i = 9; i >= 1; i--){
            for (int j = 1; j <= i; j ++){
                int p = i * j;
                System.out.print(j + "×" + i + "=" + p + "\t");
            }
            System.out.println();
        }
    }
}


class TestFor13 {
    public static void main(String[] args) {

        // 长方形 4 × 9
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j ++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        // 前面带有空格的长方形 4 × 9
        for (int i = 0; i < 4; i ++) {
            System.out.print('\t');
            for (int j = 0; j < 9; j ++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        // 平行四边形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j ++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 9; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        // 三角形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j ++) {
                System.out.print(' ');      // 打空格
            }
            for (int j = 0; j < 2*i+1; j ++) {
                System.out.print('*');      // 打星号
            }
            System.out.println();
        }

        System.out.println();

        // 菱形
        for (int i = 0; i < 7; i ++) {

            if (i < 7/2) {
                for (int j = 0; j < 7/2 - i; j ++) {
                    System.out.print(' ');      // 打空格
                }
                for (int j = 0; j < 2*i+1; j ++) {
                    System.out.print('*');      // 打星号
                }
            } else {
                for (int j = 0; j < i - 7/2; j++) {
                    System.out.print(' ');      // 打空格
                }
                for (int j = 0; j < (7-1-i)*2+1; j++) {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        System.out.println();

        // 空心菱形
        int row = 11;
        for (int i = 0; i < row; i ++) {

            if (i < row/2) {
                for (int j = 0; j < row/2 - i; j ++) {
                    System.out.print(' ');      // 打空格
                }
                for (int j = 0; j < 2*i+1; j ++) {
                    if (j == 0 || j == 2*i){
                        System.out.print('*');      // 打星号
                    } else {
                        System.out.print(' ');
                    }
                }
            } else {
                for (int j = 0; j < i - row/2; j++) {
                    System.out.print(' ');      // 打空格
                }
                for (int j = 0; j < (row-1-i)*2+1; j++) {
                    if (j == 0 || j == (row-1-i)*2){
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }

    }
}
