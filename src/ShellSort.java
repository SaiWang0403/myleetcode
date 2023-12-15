import org.junit.Test;

import java.util.Arrays;

public class ShellSort {
    @Test
    public void test(){
        int[] arr={8,9,1,7,2,3,5,4,6,0};
        shellSort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public int[] shellSort(int[] nums){
    int len=nums.length;
    int currentValue;
    int gap=len/2;
   while (gap>0){
       for (int i=gap;i<len;i++){
           currentValue=nums[i];
           int preIndex=i-gap;
           while (preIndex>=0 && nums[preIndex]>currentValue){
               nums[preIndex+gap]=nums[preIndex];
               preIndex=preIndex-gap;
           }
           nums[preIndex+gap]=currentValue;
       }
       gap=gap/2;
   }
   return nums;
    }
}