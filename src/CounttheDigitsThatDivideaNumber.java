import org.junit.Test;

public class CounttheDigitsThatDivideaNumber {
//2520
    @Test
    public void test(){
        int num=121;
        int res=countDigits(num);
        System.out.println(res);
    }




    public int countDigits(int num) {
        int x = num;
        int count = 0;

        while (num != 0) {
            int rem = num % 10;
            if (x % rem == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}
