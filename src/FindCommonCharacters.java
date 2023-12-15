import org.junit.Test;
//1002
import java.util.*;

public class FindCommonCharacters {

    @Test
    public void test(){
        String[] A={"bella","label","roller"};
        List<String> res=commonChars(A);
        System.out.println(res);
    }

    public List<String> commonChars(String[] A) {
        int[] res = new int[26];
        Arrays.fill(res, Integer.MAX_VALUE);
        for (String s : A) {
            Map<Integer, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c - 'a', map.getOrDefault(c - 'a', 0) + 1);
            }
            for (int i = 0; i < 26; i++) {
                res[i] = Math.min(res[i], map.getOrDefault(i, 0));
            }
        }
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (res[i] > 0) {
                ret.add(String.valueOf((char) (i + 'a')));
                res[i]--;
            }
        }
        return ret;
    }
}
