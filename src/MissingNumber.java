import org.junit.Test;

public class MissingNumber {
    //268

    @Test
    public void test(){
        int[] arr={0,1,3};
        int res=missingNumber(arr);
        System.out.println(res);
    }


    public int missingNumber(int[] nums) {
        //    Arrays.sort(nums);
        // if (nums[0] != 0) {
        //     return 0;
        // }

        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i + 1] > nums[i] + 1) {
        //         return nums[i] + 1;
        //     }
        // }

        // return nums[nums.length - 1] +1 ;
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
}
