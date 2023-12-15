import org.junit.Test;

import java.util.Arrays;

public class twosumtwo {

    @Test
    public void test(){
        int[] nums= {2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(twosumtwo2(nums,target)));
    }
    //二分 Onlogn 1

    public int[] twosumtwo(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            int low=i;
            int high=nums.length-1;
            while (low<=high) {
                int mid=(low+high)/2;
                if(nums[mid]==target-nums[i]){
                    return new int[] {i,mid};
                }
                else if(nums[mid]< target-nums[i]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }

        }
        return null;
    }
//双指针更快
    //On  1
    public int[] twosumtwo2(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while (low<high) {
            int sum=nums[low]+nums[high];
            if(sum==target){
                return new int[] {low,high};
            }
            else if(sum<target){
                low++;
            }
            else {
                high--;
            }
        }

        return null;
    }

}
