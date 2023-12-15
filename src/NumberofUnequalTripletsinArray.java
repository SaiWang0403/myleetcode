import org.junit.Test;
//2475
import java.util.HashMap;
import java.util.Map;

public class NumberofUnequalTripletsinArray {
    @Test
    public void test(){
        int[] A={4,4,2,4,3,4};
        int res=unequalTriplets(A);
        System.out.println(res);
    }
//要求任意3个数（在一共5个数的数组里）一共有多少排列组合 比方说有5个数  那就是 n*（n-1）*（n-2）/6  就是5*4*3 /6 就是10
    // 这个6是 3*2*1 来的
    //公式是 求任意k 个数 在一共n个数的数组里  就是 n*（n-1）*（n-2）*...（n-（k-1））/ k！

    //要求2个数一共有多少排列组合 比方说有5个数  那就是 n*（n-1）/2
    //要求任意4个数在一共10个数里的排列组合次数就是  10*（10-1）*（10-2）*（10-3）/4*3*2*1
    public int unequalTriplets(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // total combinations
        int ans = n * (n - 1) * (n - 2) / 6;

        for (int cnt : map.values()) {
            if (cnt < 2) {
                continue;
            }

            //要排除掉3个数是一样的情况 比如 4 4  4
            //也要排毒掉2个数是一样的情况比如 4 4 2
            int same3cnt = cnt * (cnt - 1) * (cnt - 2) / 6;
            //cnt * (cnt - 1) / 2 是要先从3个4 里面挑出任意2个4组合在一起的情况 （是3种  3*2/2）
            //这些情况（3种） 每种都要与后面除了4之外的数配对  （除了4还剩2 和 3） 就是要把这三种情况 * 2种情况（要和2配对一次 还要和3配对一次）剩的数就是(n - cnt)
            int same2cnt = (n - cnt) * cnt * (cnt - 1) / 2;
            ans -= same3cnt + same2cnt;
        }

        return ans;
    }
}
