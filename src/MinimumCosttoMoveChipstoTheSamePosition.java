import org.junit.Test;
//1217
public class MinimumCosttoMoveChipstoTheSamePosition {
    @Test
    public void test(){
        //在位置1上有2个硬币 位置2上有三个硬币  位置4上有两个硬币
        int[] arr={1,1,2,2,2,4,4};
        int res=minCostToMoveChips(arr);
        System.out.println(res);

    }

    public int minCostToMoveChips(int[] chips) {
        //如果所有硬币都在偶数位置上 或所有硬币都在奇数位置上 那么不需要cost
        //方法1 就是把所有基数位置上的硬币移动到任意偶数位置上
        //方法2 就是把所有偶数位置上的硬币移动到任意基数位置上
        //minum cost就会是 上两个cost方法里面 小的那种
        int even = 0;
        for(int i:chips)
            if(i%2==0)
                even++;
        return Math.min(even,chips.length-even);
    }

}
