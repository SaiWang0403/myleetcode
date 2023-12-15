import org.junit.Test;

public class InsertionSort {

    @Test
    public void test(){
        //1342
        int[] arr={3,1,4,2};
        insertionSort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public int[] insertionSort(int[] nums){
        if(nums.length==0){
            return nums;
        }

        for (int i=0;i<nums.length-1;i++){
            int preIndex=i;
           int  currentValue=nums[preIndex+1];

            while (preIndex>=0 && currentValue<nums[preIndex]){
                nums[preIndex+1]=nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1]=currentValue;
        }
        return nums;
    }

}
