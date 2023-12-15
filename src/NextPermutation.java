import org.junit.Test;
//31 下一个排列
public class NextPermutation {

    @Test
    public void test(){
        int[] arr={2,3,5,4,1};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
// 2 3 5 4 1 先找到降序前一位数 也就是i （3） 在找到i后面的（也就是 5,4,1） 中 比3 稍微（第一个比他大）大的数 也就是4 （j）  把 i 和j （3,和4） 换位置
    //再把 i 后面的降序 反转就行
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return;
        }
        int i=n-2;

        //把i 放到降序前第一个位置
        while (i>=0 && nums[i] >=nums[i+1]){
            i--;
        }
        //这种情况是 比如5,3,1 i取到了-1 也就是说明整个数组都是降序的（最后的排序数组） 这是要取最开始的数组 就把整个数组反转过来就行
        if(i<0){
            reverse(nums,0,n-1);
        }
        else {
            int j=n-1;
            //j从最后一位数往前找 一位i在降序前第一个位置 所以i后面的数必然是降序的 （或只有一个数） 要保证j这个数比i这个数大 而且是i后面所有数中第一个比他大的
            while (i<j && nums[j] <=nums[i]){
                j--;
            }
            swap(nums,i,j);
            reverse(nums,i+1,n-1);
        }
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i] =nums[j];
        nums[j] =t;
    }
    public void reverse(int[] nums, int start,int end){
        while (start <=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
