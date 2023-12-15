import org.junit.Test;

import java.util.Stack;
//2390
public class RemovingStarsFromaString {

    @Test
    public void test(){
        String s="leet**cod*e";
        String res=removeStars(s);
        System.out.println(res);
    }

    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        return c.toString();
    }
}
