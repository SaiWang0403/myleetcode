import org.junit.Test;

public class SearchInRotatedSortedArray {

    @Test
    public void test(){
        int[] arr={3,4,5,6,7,0,1};
        int target=7;
        int res=search(arr,target);
        System.out.println(res);
    }



    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                return m;
            }
            //中位数小于target
            else if(nums[m]<target){
                //中位数小于target 中位数还大于第一个数 说明target 又大于中位数 又大于第一个数 说明target在中位数右面 在右面的话l就应该向右移动
                if(nums[m]>=nums[0]){
                    l=m+1;
                }
                else {
                    //中位数小于target 中位数小于第一个数 target在下面 都在下面而target比中位数大说明 target在中位数右面
                    if(target<nums[0]){
                        l=m+1;
                    }
                    // //中位数小于target 中位数小于第一个数 target在上面  说明target在中位数左面
                    else {
                        r=m-1;
                    }
                }
            }
            //中位数大于target
            else if(nums[m]>target){
                //中位数大于target 而且中位数大于等于第一个数
                if(nums[m] >=nums[0]){
                    //中位数大于target 而且中位数大于等于第一个数 而且target小于第一个数 说明target在中位数右面
                    if(target >=nums[0]){
                        r=m-1;
                    }
                    //中位数大于target 而且中位数大于等于第一个数 而且target大于第一个数 说明target在中位数左面
                    else {
                       l=m+1;
                    }
                }
                //中位数大于target 而且中位数小于第一个数 说明target在中位数左面
                else {
                    r=m-1;
                }
            }
        }
        return -1;
    }
}
