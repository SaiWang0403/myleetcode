import org.junit.Test;
//1716
public class CalculateMoneyinLeetcodeBank {
    @Test
    public void test(){
        int n=20;
        int res=totalMoney(n);
        System.out.println(res);
    }

    public int totalMoney(int n) {
        int totalWeeks = n/7;
        int remDays = n % 7;

        int sum = totalWeeks*28;

        for(int i = 1; i < totalWeeks; i++){
            sum += 7*i;
        }

        int remDayStart = totalWeeks+1;

        while(remDays > 0){
            sum += remDayStart;
            remDayStart++;
            remDays--;
        }

        return sum;
    }
}
