import org.junit.Test;

import java.util.Arrays;

public class ThreeSumClosest {

    @Test
    public void test(){
        int[] nums={-1,2,1,-4};
        int res=threeSumClosest(nums,1);
        System.out.println(res);

    }

    public int threeSumClosest(int[] a, int t) {
        Arrays.sort(a);
        int n = a.length;
        int diff = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum < t) {
                    if (t - sum < diff) {
                        diff = t - sum;
                        res = sum;
                    }
                    j++;
                } else if (sum > t) {
                    if (sum - t < diff) {
                        diff = sum - t;
                        res = sum;
                    }
                    k--;
                } else return sum;
            }
        }

        return res;
    }
}
