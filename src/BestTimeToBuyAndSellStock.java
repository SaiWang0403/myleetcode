import org.junit.Test;
//121 https://www.bilibili.com/video/BV1eg411w7gn/?p=65&vd_source=617abaa90bad62ce2d53b4924dbe6aed
public class BestTimeToBuyAndSellStock {

    @Test
    public void test(){
        int[] prices={7,3,5,1,2,4,6};
        int res=bestTimeToBuyAndSellStock2(prices);
        System.out.println(res);
    }

    public int bestTimeToBuyAndSellStock(int[] prices){
        int len=prices.length;

        if (len<2){
            return 0;
        }

        int[][] dp=new int[len][2];
        //第一个是i表示 天数， 第二个j=0 dp[i][0] 表示当前 i天 未持有股票的 最好的情况，j=1表示 当前 i天 dp[i][1] 持有股票的 最好的 情况

        dp[0][0]=0;
        dp[0][1]=-prices[0];

        //从第二天开始遍历
        for (int i=1;i<len;i++){
            //如果未持有股票的情况，比较 前一天未持有股票的情况（盈利多少钱） 或者  前一天持有股票的情况+今天股票的情况
            dp[i][0]=Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
            //如果持有股票的情况， 比较前一天持有股票的情况 和 今天的这个股票如果持有的情况
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[len-1][0];
    }

    public int bestTimeToBuyAndSellStock2(int[] prices){
        //7 3 5 1 2 6 4
            if(prices.length<2){
                return 0;
            }
            //已知最大差距
            int profitMax=0;
            //当前已知最小元素
            int min=prices[0];

            for (int i=0;i<prices.length;i++){
                //如果当前的数比当前已知最小元素 大， 则要比较 之前的已知最大差距 和  现在的这个数-已知 最小元素
                // 大的那个就变成新的当前已知最大差距
                //prices[i] 代表着 在i这个位置 的时候 也就是当前最大差距（最大利润）
                if(prices[i]>min){
                    profitMax=Math.max(profitMax,prices[i]-min);
                }
                //如果当前的数比已知最小数还小 则无需计算 最大差距 因为肯定没之前计算的大 已知最大差距就还是之前的已知最大差距
                //只需要重新赋值
                else {
                    min=prices[i];
                }
            }
            return profitMax;
    }

}
