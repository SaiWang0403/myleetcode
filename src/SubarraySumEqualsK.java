import org.junit.Test;
//560
import java.util.HashMap;

public class SubarraySumEqualsK {
    @Test
    public void test(){
        //1,2,4,2,4
        int[] nums={1,-1,0};
        int k=0;
        int res=subarraySum(nums,k);
        System.out.println(res);
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //必须要考虑到所有的数加起来都是sum  那么sum-remove就是0 ， 这也成立 所以0必须要有一个
        mpp.put(0, 1);
        int preSum = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            //反过来想 我要的k 就是现在累加起来的所有数的和 - 需要排除再外的数 （这些数如果之前出现过的话那么就说明减完剩下的就是我需要的k）
            //subarray是连续的  减完remove 后面剩下的组成k 数的必然是 remove掉的数之后的subarray
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);
            //需要用mpp.getOrDefault(preSum, 0) + 1)  是因为比如 1，-1,0 k=0  本来0有一个 然后presum 1 加上-1 又有一个 所以有两个
            //如果只是map.put(presum,1) 那么就还只是一个 就没把 只有0 是k  和1， -1  加起来也是k 这种情况算是两个个情况 就错了
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }
}
