import org.junit.Test;
//2535
public class DifferenceBetweenElementSumandDigitSumofanArray {

    @Test
    public void test(){
        int[] nums={1,15,6,3};
        int res=differenceOfSum(nums);
        System.out.println(res);
    }


    public int differenceOfSum(int[] nums) {
        int elsum=0,digitsum=0;
        for(int i:nums){
            elsum+=i;
            digitsum+=(i>9) ?checkdigit(i) :i;
        }
        return Math.abs(elsum-digitsum);
    }

    public int checkdigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
