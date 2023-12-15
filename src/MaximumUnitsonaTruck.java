import org.junit.Test;
//1710
import java.util.Arrays;

public class MaximumUnitsonaTruck {
    @Test
    public void test(){
        int[][] B={{1,3},{3,1},{2,2}};
        int T=4;
        int res=maximumUnits(B,T);
        System.out.println(res);
    }

    public int maximumUnits(int[][] B, int T) {
        Arrays.sort(B, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for (int[] b : B) {
            int count = Math.min(b[0], T);
            ans += count * b[1];
            T -= count;
            if (T == 0) return ans;
        }
        return ans;
    }
}
