import org.junit.Test;
//34 在排序数组中查找元素的第一个和最后一个位置
import java.util.Arrays;

public class FindFirstAndLastPositionOfElenmentInSortedArray {

    @Test
    public void test(){
        int arr[] ={5,7,7,8,8,10};
        int[] res=searchRange(arr,8);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public int[] searchRange(int[] nums, int target) {
            if(nums==null || nums.length==0){
                return new int[]{-1,-1};
            }
            int[] res=new int[2];
            Arrays.fill(res,-1);
            int l=0;
            int r=nums.length-1;
            //这里是l<R 不是l《=R 因为这个while里没有赋值的情况 例如if(arr[mid]==target) return mid;
        //所以最后一次l=r 时候退出循环 在外面检查赋值
            while (l<r){
                int mid=l+r>>1;
                //查左面那个target位置 普通二分是nums[mid]>target 的话 target在左面 要往左查 r=mid-1 可是这道题nums[mid]>=target 时 赋值r=mid
                //因为四舍五入的话是向左取值 比如 l=3,r=4 mid会取3 （不用mid=l+r-1， 因为他自己就会往左走） 而且 nums[mid]>=target 时会r=mid  target在左面 要往左查 右边界r会一直往左走 直到最左面的nums[mid]=target
                //简单的说就是如果target 小于等于mid的数 一直把右边界往左推 知道最左面nums[mid]=target的情况
                if(nums[mid]>=target){
                    r=mid;
                }else {
                    //要加1 因为这时候target 比mid数 大 所以肯定不在mid上 ， mid 和mid左面的数就肯定都不是 所以把左边界变成mid+1
                    l=mid+1;
                }
            }
            //这时候l 和 r 在同一个位置
            if(target==nums[l]){
                res[0]=l;
            }
            l=0;
            r=nums.length-1;
            while (l<r){
                //需要加一 要不然永远取不到最右面的数
                int mid=l+r+1>>1;
                //5 7 7 8 8 10
                //因为之前mid=l+r+1除以2（这样l=4 r=5 mid可以取到5 要不mid永远是4 l也永远是4 永远出不了循环）  所以nums[mid]一直会往右面找 target 同事赋值l=mid 这样一直把l往右面推 就能取到最右面的 nums[mid]=target情况
                //简单的说就是 target比mid数 大于等于的话 一直把左边界l 往右推 推到最后一个nums[mid]=target情况
                if(nums[mid]<=target){
                    l=mid;
                }else {
                    r=mid-1;
                }
            }
            if(target==nums[l]){
                res[1]=l;
            }
            return res;
    }
}
