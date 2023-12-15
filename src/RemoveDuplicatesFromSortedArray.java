import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

//26
public class RemoveDuplicatesFromSortedArray {

    @Test
    public void test(){
        int[] arr={1,1,2};
        int[] res=removeDuplicates(arr);
        System.out.println(res);

    }

    public int[] removeDuplicates(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                //要先index+1 再变  把num【i】 赋值给新的index的位置的数
                nums[++index]=nums[i];
            }
        }
        int[] res=new int[index];
        for (int i = 0; i < index; i++) res[i] = nums[i];
        return res;


    }
}
