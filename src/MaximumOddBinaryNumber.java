import org.junit.Test;
//2864
public class MaximumOddBinaryNumber {
    @Test
    public void test(){
        String s="010";
        String res=maximumOddBinaryNumber(s);
        System.out.println(res);
    }

    public String maximumOddBinaryNumber(String s) {
        int oneCount = -1;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            oneCount += (s.charAt(i) == '1') ? 1 : 0;
        }
        for (int i = 0; i < s.length(); i++, oneCount--) {
            ans.append(oneCount > 0 ? '1' : '0');
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.append('1').toString();
    }
}
