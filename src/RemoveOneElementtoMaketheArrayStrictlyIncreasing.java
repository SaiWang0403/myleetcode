import org.junit.Test;
//1909
public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {
    @Test
    public void test(){
        int[] arr={2,3,1,2};
        boolean res=canBeIncreasing(arr);
        System.out.println(res);
    }

    public boolean canBeIncreasing(int[] nums) {
        int count=0;
        int p=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] || nums[i]==nums[i+1]) {
                count++;
                p=i;
            }
        }
        if(count>1) return false;
        else if(count==1){
            if(p==0 || p== nums.length-2) return true;
            if(nums[p+1]>nums[p-1] || nums[p+2]>nums[p]) return true;
            else return false;
        }
        return true;
    }
}
