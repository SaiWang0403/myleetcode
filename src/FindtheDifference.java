import org.junit.Test;
//389
import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {

    @Test
    public void test(){
        String s="abcd";
        String t="abcde";

        char res=findTheDifference(s,t);
        System.out.println(res);
    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0){
                return c;
            }
        }
        return 'a';

    }
}
