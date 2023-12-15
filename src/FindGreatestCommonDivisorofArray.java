import org.junit.Test;
//1979
import java.util.Arrays;

public class FindGreatestCommonDivisorofArray {
    @Test
    public void test(){
        int[] nums={3,3};
        int res=findGCD(nums);
        System.out.println(res);
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int res=0;
        res=gcd(a,b);
        return res;
    }
    public int gcd(int a,int b){
        return b==0 ? a:gcd(b,a%b);
    }
}
