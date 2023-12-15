import org.junit.Test;
//153
public class FindMinimuminRotatedSortedArray {
    @Test
    public void test(){
        int[] arr={3,4,5,1,2};
        int res=findMin(arr);
        System.out.println(res);
    }

    public int findMin(int[] nums) {
        //3 1 5
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]){
                //left要加一 因为如果nums【mid】大 那么要的数肯定在他左面 （不包括num【mid】这个数）
                left=mid+1;
            }else if(nums[mid]<nums[right]){
                // //right不要加一 因为如果nums【mid】小 那么要的数肯定在他左面 或者nums【mid】他自己就是要的那个数 （包括num【mid】这个数）
                right=mid;
            }
        }
        return nums[left];
    }
}
