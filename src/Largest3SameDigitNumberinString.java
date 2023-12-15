import org.junit.Test;
//2264
import java.util.HashMap;
import java.util.Map;

public class Largest3SameDigitNumberinString {
    @Test
    public void test(){
        String s="6777133339";
        String res=largestGoodInteger(s);
        System.out.println(res);
    }

    public String largestGoodInteger(String num) {
        if (num.length() <= 2)
            return "";

        Map<Integer, String> stringMap = new HashMap<>();

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 2) && num.charAt(i) == num.charAt(i + 1))
                stringMap.putIfAbsent(num.charAt(i) - '0', num.substring(i, i + 3));
        }

        for (int i = 9; i >=0; i--)
            if (stringMap.containsKey(i))
                return stringMap.get(i);

        return "";
    }
}
