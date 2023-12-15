import org.junit.Test;
//2706
import java.util.Arrays;

public class BuyTwoChocolates {
    @Test
    public void test(){
            int[] prices={1,2,2};
            int money=3;
            int res=buyChoco(prices,money);
        System.out.println(res);
    }

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[0]+prices[1]<=money){
            return money-prices[0]-prices[1];
        }
        return money;
    }
}
