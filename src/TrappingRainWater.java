import org.junit.Test;

import java.util.Map;

public class TrappingRainWater {
    //42
    @Test
    public void test(){
        int[] height={1,2,4,3,8};

        int res=trap(height);
        System.out.println(res);
    }

    public int trap(int[] height) {
        int l=0; int r=height.length-1;
        int lmax=0; int rmax=0; int ans=0;
        //双指针 算每个指针指的地方能留住多少水

        while (l<r){
            //想象如果 从左到右 桶越来越高或越来越矮 那是不可能留住任何水的 能留住水的情况必须是中间有个缺口
            //
            lmax= Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            // 两件事 第一件 如果左面柱子 比右面矮 要按左面柱子算
            // 第二件事 怎么算 就是 按左面指针经过的左柱子的最高值 - 当前指针在的左柱子高度
            //为什么要用左柱子最大值 因为要用这个最高左柱子 当左面边界柱子 （必须有个柱子是左面最高的 两边的柱子都比他矮 比如 1,2,4,3,8 当4是最高左柱子时 右面3比他矮 才能留住水，指针在1,2,4时留不到任何水）
            //换个角度想 指向3的时候 就是 当左指针指的柱子高度下降（第二件事） 而且右柱子也要大于3  （而且 lmax<rmax 第一件事） 这时候才能留住水

            if(lmax<rmax){
                ans+=lmax-height[l];
                l++;
            }else {
                ans+=rmax-height[r];
                r--;
            }
        }
        return  ans;
    }

}