import org.junit.Test;
//238
import java.util.Arrays;

public class ProductofArrayExceptSelf {
    @Test
    public void test(){
        int[] num={1,2,3,4};
        int[] res=productExceptSelf(num);
        for(int n:res){
            System.out.println(n);
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        //让nums【i】的前面所有数相乘 放到ans【i】 上 不包括nums【i】
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        //让nums【i】的后面所有数相乘 放到ans【i】 上 不包括nums【i】
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
