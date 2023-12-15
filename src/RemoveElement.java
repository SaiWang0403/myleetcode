import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

//27 移除元素  去掉3
public class RemoveElement {

    @Test
    public void test(){
        int[] arr={3,2,2,3};
        int val=3;
        int res=removeElement(arr,val);
        System.out.println(res);
    }

    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index++]=nums[i];
            }

        }

        return  index;
//        int[] newarr=new int[index];
//        for (int j=0;j<index;j++){
//            newarr[j]=nums[j];
//        }
//
//        return newarr;
    }
}
