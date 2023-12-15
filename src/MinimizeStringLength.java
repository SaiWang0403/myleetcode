import org.junit.Test;
//2716
import java.util.HashSet;

public class MinimizeStringLength {
    @Test
    public void test(){
        String s="aaabc";
        int res=minimizedStringLength(s);
        System.out.println(res);
    }

    public int minimizedStringLength(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
