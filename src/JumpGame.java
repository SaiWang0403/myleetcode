import org.junit.Test;
//55
public class JumpGame {

    @Test
    public void test(){
        int[] arr={3,2,1,0,4};
        boolean res=canJump(arr);
        System.out.println(res);
    }

//判断能不能调到最后一个点 这个问题其实就是判断能不能跳到每一个点
    public boolean canJump(int[] nums) {
        //end是 能调到的最远下标
            int end=0;
            for (int i=0;i<nums.length;i++){
                //如果 能跳到的最远下标 小于 当前这个点的下标 说明跳不到这个点了 那就意味着永远到不了这个点 就不行， 因为如果行的话 每个点都能跳的到
                if(end<i){
                    return false;

                }
                end=Math.max(end,nums[i]+i);
            }
            return true;
    }
}
