import org.junit.Test;
//164
import java.util.ArrayList;
import java.util.List;

public class MaximumGap {
    @Test
    public void test(){
        int[] nums={100,3,2,1};
        int res=maximumGap(nums);
        System.out.println(res);
    }
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        int hi = 0, lo = Integer.MAX_VALUE, ans = 0;
        for (int n : nums) {
            hi = Math.max(hi, n);
            lo = Math.min(lo, n);
        }
        int bsize = Math.max((hi - lo) / (nums.length - 1), 1);
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = (hi - lo) / bsize; i >= 0; i--)
            buckets.add(new ArrayList<>());
        for (int n : nums)
            buckets.get((n - lo) / bsize).add(n);
        int currhi = 0;
        for (List<Integer> b : buckets) {
            if (b.isEmpty()) continue;
            int prevhi = currhi > 0 ? currhi : b.get(0), currlo = b.get(0);
            for (int n : b) {
                currhi = Math.max(currhi, n);
                currlo = Math.min(currlo, n);
            }
            //每个bucket里可能有很多数 比如第一个bucket有3,2,1 第二个bucket是 99,100 所以要用现在的bucket中的最小数减去上一个bucket的最大数
            ans = Math.max(ans, currlo - prevhi);
        }
        return ans;
    }
}
