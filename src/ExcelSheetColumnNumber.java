import org.junit.Test;

public class ExcelSheetColumnNumber {

    @Test
    public void test(){
        String s="AB";
        int res=titleToNumber(s);
        System.out.println(res);
    }


    public int titleToNumber(String s) {
        if (s.length() == 1) return s.charAt(0) - 'A' + 1;
        int pow = 1, sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sum += (c - 'A' + 1) * pow;
            pow *= 26;
        }
        return sum;
    }
}
