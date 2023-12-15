import org.junit.Test;
//189
public class RotateArray {
    @Test
    public void test(){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for(Integer num :nums){
            System.out.println(num);
        }
    }


    public void rotate(int[] nums,int k){
        k=k% nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums,int begin,int end){
        while (begin<end){
            swap(nums,begin,end);
            begin++;
            end--;
        }
    }

    public void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


}
