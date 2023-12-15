import org.junit.Test;
//1475
import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop {
    @Test
    public void test(){
        int[] prices={8,4,6,2,3};
        int[] res=finalPrices(prices);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] finalPrices(int[] prices) {
        int arr[] = new int[prices.length];
        Stack<Integer> stack = new Stack();
        stack.push(prices[prices.length - 1]);
        arr[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                arr[i] = prices[i];
            } else {
                arr[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return arr;
    }
}
