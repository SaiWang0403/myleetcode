import org.junit.Test;
//80
public class RemoveDuplicatesfromSortedArrayII {

    @Test
    public void test(){
        int[] arr={1,1,2,2,2,2,3,3};
        int res=removeDuplicates(arr);
        System.out.println(res);
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int index=1;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[index-1]){
                nums[++index]=nums[i];
            }
        }
        return index+1;

    }
}
