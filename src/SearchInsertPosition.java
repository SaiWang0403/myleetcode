import org.junit.Test;

public class SearchInsertPosition {

    @Test
    public void test(){
        int[] arr={1,3,5,6};
        int res=searchInsert(arr,2);
        System.out.println(res);

    }


    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        while(l<r){
            int mid=(l+r)/2;
            //要大于等于 没有等于的话就错过了
            if(nums[mid]>=target){
                r=mid;
            }
            else{
                //一定要l 往后加一  因为 （0+1）/2 等于0 所以l 要加1 才能打破这个僵局 要不一直循环
                l=mid+1;
            }
        }
        return r;
    }
}
