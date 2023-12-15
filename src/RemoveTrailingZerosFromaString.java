import org.junit.Test;
//2710
public class RemoveTrailingZerosFromaString {
    @Test
    public void test(){
        String num="51230100";
        String res=removeTrailingZeros(num);
        System.out.println(res);
    }

    public String removeTrailingZeros(String num) {
        int len = num.length();
        while (--len >= 0) {
            if (num.charAt(len) != '0') break;
        }
        return num.substring(0, ++len);
    }
}
