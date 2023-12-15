import org.junit.Test;
//2460
public class ApplyOperationstoanArray {
    @Test
    public void test(){
        int[] nums={1,2,2,1,1,0};
        int[] res=applyOperations(nums);
        for(int i:res){
            System.out.println(i);
        }
    }

    public int[] applyOperations(int[] nums) {
        int index=0;
        while(index<nums.length-1){
            if(nums[index]!=nums[index+1]){
                index++;
            }else{
                nums[index]=nums[index]*2;
                nums[index+1]=0;
                index++;
            }

        }
        int[] res=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[j++]=nums[i];
            }
        }
        return res;
    }
}
