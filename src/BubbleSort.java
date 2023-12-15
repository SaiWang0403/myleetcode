import org.junit.Test;

import java.util.ArrayList;

public class BubbleSort {

    @Test
    public void test(){
        int[] arr={1,4,3,2};
        int[] res=bubbleSort(arr);

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] bubbleSort(int[] nums){
        if (nums.length==0) {
            return nums;
        }
        //i<nums.length-1也行
        //有多少数重复多少遍
        for(int i=0;i<nums.length-1;i++){
            //把最大数放在最后
            for (int j=0;j<nums.length-1-i;j++){
                if(nums[j+1]<nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }

}
