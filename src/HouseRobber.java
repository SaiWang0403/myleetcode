import org.junit.Test;
//198
public class HouseRobber {
    @Test
    public void test(){
        //可以连续跳过两个房子
        int[] nums= {4,3,2,4};
        int res=rob2(nums);
        System.out.println(res);

    }
    //如果用贪心是不对的， 贪心 是取局部最优从而导出全剧最优 可是这里取不到局部最优 先看1,2 如果放弃1取2， 再看 1,2,3 那就的放弃2取三，可是1取不到了，所以不能一直找眼前利益（局部最优）
    // 要用动态规划 因为当知道i=0 的最优解和 i=1的最优解时 得到第三个数（i=2） 便可以推导出 i=2时的最优解， 当知道i=0，i=1，i=2 的最优解时 又拿到第四个数（i=3） 便可以求出i=3时的最优解，这样以此类推 可以动态的（进来什么数就能算出当前位置的最优解）找到所有地方的最优解 找到最优一位的最优解便是这道题的答案
    public int rob(int[] nums) {
        int index=nums.length-1;
        return  rob1(nums,index);

    }
    //rob1 递归 就是找到index【i】 时的最优解
//index[i] 上的最优解（能抢劫到的钱）也就是 要比较i-1 上的位置的钱 和 i-2 加上 i的位置上的钱
    // 找i-1 位置的最优解 也就是 把 i-1 看成 i 还是变成 index【i】 还是同样找index【i】 的最优解 （相对于最开始的i就是 在比较 i-2 和 i-3 加上i-1）
    public  int rob1(int[] nums,int index){
            if(nums ==null || index<0){
                return 0;
            }
            if(index ==0){
                return nums[0];
            }
            return Math.max(rob1(nums,index-1),rob1(nums,index-2)+nums[index]);
    }

    //第二种方法 动态规划 + 迭代就是把递归 进化
    //动态规划特点 1最优子结构（这个问题的最优包含了每个子问题的最优）n的最优解 就包含了n-1 n-2 。。。的最优解
    //2 递推公式
    //3 重复子问题
    public int rob2(int[] nums){
        int length=nums.length;
        if(nums==null || length ==0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        //i=2 的时候的最优解 需要i=0 ，i=1，i=2 时候的值来计算（i=1的值 和i=0的值加上i=2的值比较）所以知道i=2 也就是第三个值的时候就可以开始循环
        // 当知道前三个的最优解时 拿到了第四个的值 便可以动态推导出第四个的最优解 动态规划
        for (int i=2;i<length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[length-1];

    }

    public  int rob3(int[] nums){
        int length=nums.length;
        if(nums==null || length ==0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            int temp=second;
           second=Math.max(first + nums[i],second);
           first=temp;

        }
        return  second;
    }

}
