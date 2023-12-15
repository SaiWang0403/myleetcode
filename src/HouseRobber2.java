import org.junit.Test;
//213
public class HouseRobber2 {
    @Test
    public void test(){
        int[] arr={2,7,9,3,1};
        int res=houseRobber2(arr);
        System.out.println(res);

    }
//小偷抢劫的房子是首位相连的，意味着一次抢劫中不能 又偷第一家 又偷最后一家
    //如果房子是偶数个 那么没影响 因为不会 既偷第一家 又偷最后一家
    //如果房子是奇数个 那么肯定少偷一家 结局方法是看不偷第一家合算，还是不偷最后一家合算
    public  int houseRobber2(int[] nums){
        if(nums.length==0 || nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int start=0;
        int end=nums.length-1;

        //如果不偷最后一家 那么就算出从第一家 偷到 倒数第二家 能偷多少钱
        // //如果不偷第一家 那么就算出从第二家 偷到最后一家
        // 把这两种情况能偷多少钱都算出来 就是比较这两种情况谁偷的更多就选哪种方案
        return Math.max(houseRobber3(nums,start,end-1),houseRobber3(nums,start+1,end));
    }

    public int houseRobber3(int[] nums, int start, int end){
        int first=nums[start];
        int second=Math.max(nums[start],nums[start+1]);
        for (int i=start+2;i<=end; i++){
            int temp=second;
            second=Math.max(first+nums[i],second);
            first=temp;
        }
        return second;
    }

}
