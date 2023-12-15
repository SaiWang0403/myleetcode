import org.junit.Test;

public class ReverseWordsinaStringIII {
//557
    @Test
    public void test(){
        String s="Let's take LeetCode contest";
        String res=reverseWords(s);
        System.out.println(res);

    }


    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        for (;j<c.length;j++) {
            if (c[j] == ' ') {
                reverseWord(c, i, j-1);
                i = j+1;
            }
        }
        reverseWord(c, i, j-1);
        return new String(c);
    }

    private void reverseWord(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }
}
