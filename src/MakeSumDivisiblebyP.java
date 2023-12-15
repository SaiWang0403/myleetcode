import org.junit.Test;
//1590
import java.util.HashMap;

public class MakeSumDivisiblebyP {
    @Test
    public void test(){
        int[] nums={3,1,4,2};
        int p=6;
        int res=minSubarray(nums,p);
        System.out.println(res);
    }

    public int minSubarray(int[] nums, int p) {

        long sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        if (sum % p == 0) return 0;

        int requiredRem = (int) (sum % p);
        //问题是去除一个数得到6 转变成 找到subarry能组成4  ，这样去掉那个最小的subarry就得到6
        HashMap<Integer, Integer> rem = new HashMap<>();
        rem.put(0, -1);

        sum = 0;
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int curRem = (int) (sum % p);

            //现有的curRem 减去需要的rem 如果是 之前保留的currem 那么就说明从之前保留的地方 到现在的地方 的余数是reqiuredrem
            int searchFor = curRem - requiredRem;
            if (searchFor < 0) searchFor += p;
            if (rem.containsKey(searchFor))
                res = Math.min(res, i - rem.get(searchFor));

            // if remainder repeats then override it with latest sub array
            rem.put(curRem, i);
        }
        return (res == nums.length) ? -1 : res;
    }
}
