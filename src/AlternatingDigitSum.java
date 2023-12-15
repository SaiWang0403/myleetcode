import org.junit.Test;

public class AlternatingDigitSum {

    @Test
    public void test(){
        int n=1887;
        int res=alternateDigitSum(n);
        System.out.println(res);
    }

    public int alternateDigitSum(int n) {
        int i = 0, sum = 0;
        n = reverse(n);
        while (n > 0) {
            int rem = n % 10;
            sum += (i++ % 2 == 0)? rem : -rem;
            n /= 10;
        }

        return sum;
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public int alternateDigitSum2(int n) {
        int sum = 0, i = 0;
        for (char c : (n + "").toCharArray()) {
            int x = c - '0';
            sum += (i++ % 2 == 0)? x : -x;
        }

        return sum;
    }
}
