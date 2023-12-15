import org.junit.Test;

public class ChoiceSort {

    @Test
    public void test(){
        int[] arr={1,4,3,2};
        choiceSort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public int[] choiceSort(int[] nums){
        if(nums.length==0){
            return nums;
        }

        for (int i=0;i<nums.length;i++){
            int minIndex=i;
            for (int  j=i+1;j<nums.length;j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if(i!=minIndex){

                int temp=nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }

}
