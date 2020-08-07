package Arrays_;

import java.util.Arrays;

/**
 * Arrays练习：将一个随机自促传中的所有字符升序排列，并倒序打印
 */


public class TestArrays {
    public static void main(String[] args) {
        String line = "ysKUreaytWTRHsgFdSAoidq";
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }   // y y t s s r q o i g e d d a W U T S R K H F A
    }
}
