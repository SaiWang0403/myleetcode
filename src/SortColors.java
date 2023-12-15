import org.junit.Test;

import java.util.Arrays;

public class SortColors {
    //75
    @Test
    public void test(){
        int[] nums={2,0,1};

//        0 0 2 0  2  2
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
//先定义左边界在最左边的数的左边一位 右边界在最右边数的右边一位
//关键就是 碰到1 的话 1不变 cur往下走
    //碰到cur=0 的话 让现在在的cur 放到左边界的右边一位 并让左边界往右移动一位 并让cur+1 （往下走） 因为cur是从左往右走的 所以碰到cur=0的时候 从左边界+1位置拿回来的数只能是1或0， 因为2肯定已经放到右边了 不可能在左边界+1 的位置 比如2 0 1 所以要+1 因为不管是0 还是1 都没必要再检查了 应该往下走
    //碰到cur=2 的话 要把cur 放到右边界左边一位 并让右边界向左移一位 这时候不能让cur+1 因为从右边界-1位置 回来的数没经过检查 所以 可能是2 （如果返回来的是0或1 cur后移不后移的无所谓） 如果是2 不能放过 （一旦放过2 就会在后面1或0前面了） 所以必须再检查cur， cur不能移动 因为右边界会向左移动 所以不用担心会一直交换2个相同位置的数 比如 2 2 2

    public void sortColors(int[] nums) {
        int L=-1;
        int R=nums.length;
        int cur=0;
        //R 必然在 2 上或 最右边的null 上 所以当cur=R 也就是cur在右边界2 上时 说明现在和后面的数都是2了 循环结束 如果再循环就错了 会把2 和前面（右边界前一位）的1或0 交换 就不对了  比如 0 1 2 cur在2上
        while (cur<R){
            if(nums[cur]>1){
                swap(nums,cur,--R);
            }else if (nums[cur] <1){
                swap(nums,++L,cur++);
            }else {
                cur++;
            }
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
