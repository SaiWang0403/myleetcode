import org.junit.Test;
//503
import java.util.Stack;

public class NextGreaterElementII {
    @Test
    public void test(){
        int[] nums={1,2,3};
        int[] res=nextGreaterElements(nums);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        // we double the length of loop to imitate a circular array
        // just remember to use i%n for indexing
        for (int i = 2*n; i>=0; i--) {
            while (!s.isEmpty() && s.peek() <= nums[i%n]) {
                s.pop();
            }
            res[i%n] = s.isEmpty() ? -1 : s.peek();
            s.push(nums[i%n]);
        }
        return res;

    }
}
