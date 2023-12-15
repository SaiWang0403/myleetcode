import org.junit.Test;
//11 盛最多水的容器
public class ContainerWithMostWater {

    @Test
    public void test(){
        int[] arr= {1,8,6};
        int res=maxArea(arr);
        System.out.println(res);
    }

    public int maxArea(int[] height) {
        int ans=0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            //面积是高 乘以宽 高要取两个纵坐标高度小的那一个， 宽度就是右面的那个减去左面的那个
            ans=Math.max(ans,Math.min(height[left],height[right]) * (right-left));
            //取完后 因为要接着找更大的值 所以要移动高度小的那个 因为如果要移动高的那个 下次的结果只能小于等于这次的 没意义
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}
