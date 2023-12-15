import org.junit.Test;
//计数排序
import java.util.Arrays;

public class CountingSort {
    @Test
    public void test() throws Exception {
        int[] arr={4,4,6,0,-10,-2};
        int[] res=sort(arr);

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }

//  public int[] sort(int[] arr){
//        int[] res=Arrays.copyOf(arr,arr.length);
//        int max=getMax(res);
//
//        return countingSort(res,max);
//
//  }
//
//  public int[] countingSort(int[] res,int max){
//        int bucketLen=max+1;
//        int[] bucket=new int[bucketLen];
//        for(int value:res){
//            bucket[value]++;
//        }
//        int sortIndex=0;
//        for (int j=0;j<bucketLen;j++){
//            while (bucket[j]>0){
//                res[sortIndex++]=j;
//                bucket[j]--;
//            }
//        }
//        return res;
//  }
//
//  public int getMax(int[] res){
//        int max=res[0];
//        for (int i=0;i<res.length;i++){
//            if(max<res[i]){
//                max=res[i];
//            }
//        }
//        return max;
//  }
//O(n+k);
    public int[] sort(int[] nums) {
        // No sorting needed if this is true
        if (nums.length < 2) {
            return nums;
        }

        // Make variables needed for map array
        int max = nums[0];
        int negOffset = 0; // Needed in case of negatives because there are no negative indices in arrays
        for (int n : nums) {
            max = Math.max(n, max);
            negOffset = Math.min(n, negOffset);
        }
        negOffset = -negOffset;

        // Create the map array
        int[] map = new int[max+negOffset+1];
        for (int n : nums)
            map[n+negOffset]++;

        // Going through map array and putting all elements back into original array sorted
        int arrI = 0;
        for (int i = 0; i < map.length; i++) {
            while (map[i]-- > 0) {
                nums[arrI++] = i - negOffset;
            }
        }

        return nums;
    }
}