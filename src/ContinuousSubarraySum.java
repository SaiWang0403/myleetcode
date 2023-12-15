import org.junit.Test;
//523
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContinuousSubarraySum {
    @Test
    public void test(){
        int[] nums={8,9,6,6};
        int k=6;
        boolean res=checkSubarraySum(nums,k);
        System.out.println(res);
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int pre=0;
        int cur=0;
        for(int n:nums){
            cur+=n;
            if(set.contains(cur%k))
                return true;
            //比较cur之后再把之前记录的pre加到set里 就保证了 set里的数 是现在cur check到的之前的两个数（cur-2 比如到第一个6的时候 我set里只有第一个数8的时候余的2）
            //这样就保证了 如果有的话 那么至少是两个数 cur 和cur-1的数
            set.add(pre);
            pre=cur%k;
        }

        return false;
    }
}
