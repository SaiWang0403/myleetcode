import org.junit.Test;
//1413
public class MinimumValuetoGetPositiveStepbyStepSum {
    @Test
    public void test(){
        int[] nums={-3,2,-3,4,2};
        int res=minStartValue(nums);
        System.out.println(res);
    }
    public int minStartValue(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i :nums){
            sum+=i;
            min=Math.min(sum,min);
        }
        if(min<0){
            return (-min)+1;
        }
        return 1;
    }
}
