import org.junit.Test;
//2335
public class MinimumAmountofTimetoFillCups {
    @Test
    public void test(){
        int[] A={1,4,2};
        int res=fillCups(A);
        System.out.println(res);
    }

    public int fillCups(int[] A) {
        int mx = 0, sum = 0;
        for(int a: A) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum+1)/2);
    }
}
