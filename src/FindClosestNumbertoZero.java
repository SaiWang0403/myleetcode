import org.junit.Test;
//2239
public class FindClosestNumbertoZero {

    @Test
    public void test(){
        int[] nums={-4,-2,-1,1,4,8};
        int res=findClosestNumber(nums);
        System.out.println(res);
    }

    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i: nums)
            if(Math.abs(i) < Math.abs(res) || i == Math.abs(res))
                res = i;
        return res;
    }
}
