import org.junit.Test;
//2154
public class KeepMultiplyingFoundValuesbyTwo {
    @Test
    public void test(){
        int[] nums={12,5,3,6,1};
        int original=3;
        int res=findFinalValue(nums,original);
        System.out.println(res);
    }


    public int findFinalValue(int[] nums, int original) {
        while(true){
            if(isFound(nums,original)){
                original=original*2;
            }
            else{
                return original;
            }
        }
    }

    public boolean isFound(int[] nums,int original){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                return true;
            }
        }
        return false;
    }
}
