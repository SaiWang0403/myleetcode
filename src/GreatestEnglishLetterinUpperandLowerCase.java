import org.junit.Test;
//2309
import java.util.HashSet;
import java.util.Set;

public class GreatestEnglishLetterinUpperandLowerCase {
    @Test
    public void test(){
        String s="arRAzFif";
        String res=greatestLetter(s);
        System.out.println(res);
    }

    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
            set.add(ch);

        for(char ch = 'Z'; ch >= 'A'; ch--)
            if(set.contains(ch) && set.contains((char)('a'+(ch-'A'))))
                return ""+ch;
        return "";
    }
}
