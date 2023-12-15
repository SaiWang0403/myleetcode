import org.junit.Test;
//2778
public class SumofSquaresofSpecialElements {
    @Test
    public void test(){
        int[] nums={1,2,3,4};
        int res=sumOfSquares(nums);
        System.out.println(res);
    }

    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int res=0;
        for(int i=0;i<l;i++){
            if(l%(i+1)==0){
                res+=nums[i]*nums[i];
            }
        }
        return res;
    }
}
