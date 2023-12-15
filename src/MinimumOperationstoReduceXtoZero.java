import org.junit.Test;
//1658
public class MinimumOperationstoReduceXtoZero {
    @Test
    public void test(){
        int[] nums={1,1,4,2,3};
        int x=5;
        int res=minOperations(nums,x);

        System.out.println(res);
    }

    public int minOperations(int[] nums, int x) {
        int target = -x, n = nums.length;
        for (int num : nums) target += num;

        if (target == 0) return n;

        int maxLen = 0, curSum = 0, left = 0;

        for (int right = 0; right < n; ++right) {
            curSum += nums[right];
            //这一步就是看如果把前面的数减掉后 后面的数能不能是6
            while (left <= right && curSum > target) {
                curSum -= nums[left];
                //如果还留着最前面的数肯定不行了 （加上前面的数的情况已经看过了） 所以看看删了它 后面的数行不行（能不能凑到6）
                left++;
            }
            //如果凑到了6 那么记录长度
            if (curSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen != 0 ? n - maxLen : -1;
    }
}
