import org.junit.Test;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {

    @Test
    public void test(){
        int num=2932;
        int res=minimumSum(num);
        System.out.println(res);

    }


    public int minimumSum(int num) {
        int[] nums=new int[4];
        for(int i=0;i<4;i++){
            nums[i]=num%10;
            num=num/10;
        }
        Arrays.sort(nums);
        return (nums[0]+nums[1])*10 +nums[2]+nums[3];
    }
}
