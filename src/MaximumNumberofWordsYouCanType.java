import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
//1935
public class MaximumNumberofWordsYouCanType {

    @Test
    public void test(){
        String text="hello world";
        String b="ad";
        int res=canBeTypedWords(text,b);
        System.out.println(res);
    }

    int ans = 0;
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet();
        for (char c : brokenLetters.toCharArray()) set.add(c);

        String [] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++) traverse(arr[i], set);
        return ans;
    }

    public void traverse(String s, Set<Character> set) {
        for (int i = 0; i < s.length(); i++)
            if (set.contains(s.charAt(i))) return;
        ans++;
    }
}
