import org.junit.Test;

public class PerfectNumber {
//507
    @Test
    public void test(){
            int num=28;
            boolean res=checkPerfectNumber(num);
        System.out.println(res);
    }

    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;

        int sum = 0;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                sum += i + num / i;
        }
        sum = sum + 1;

        return sum == num;
    }
}
