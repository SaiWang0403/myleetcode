import org.junit.Test;

public class BruteForce {
//给定两个字符串text和pattern，请你在text字符串中找出pattern字符串出现的第一个位置（下标从0开始），如果不存在，则返回-1;
    @Test
    public void test(){
        String txt= "ccabdabc";
        String pattern= "abcf";

        int res=bf(txt,pattern);
        System.out.println(res);

    }

    public static int bf(String ts, String ps) {
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        while (i < t.length && j < p.length) {
            if (t[i] == p[j]) { // 当两个字符相同，就比较下一个
                i++;
                j++;
            } else {
                i = i - j + 1; // 一旦不匹配，i后退
                j = 0; // j归0
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }


}
