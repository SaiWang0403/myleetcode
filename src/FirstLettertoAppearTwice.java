import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class FirstLettertoAppearTwice {
    @Test
    public void test(){
        String s = "abccbaacz";
        char res=repeatedCharacter(s);
        System.out.println(res);
    }


    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i<s.length(); i++){
            if(!set.add(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return 'a';
    }
}
