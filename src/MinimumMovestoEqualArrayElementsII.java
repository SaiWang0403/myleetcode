import org.junit.Test;
//462
import java.util.Arrays;
import java.util.Random;
//462
public class MinimumMovestoEqualArrayElementsII {
    @Test
    public void test(){
        int[] arr={1,9,10,2,9};
        int res=minMoves2(arr);
        System.out.println(res);
    }

    public int minMoves2(int[] nums) {
        int operations = 0, mid = quickSelect(nums, 0, nums.length-1, nums.length/2);
        for (int num: nums) operations += Math.abs(mid - num);
        return operations;
    }

    //找到sort好的arr的位置k上的数 也就是中位数
    private int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];
//[)
        int pIndex = new Random().nextInt(right - left + 1) + left;
        pIndex = partition(nums, left, right, pIndex);

        if (pIndex == k) return nums[k];
        else if (pIndex < k) return quickSelect(nums, pIndex+1, right, k);
        return quickSelect(nums, left, pIndex-1, k);
    }

    private int partition(int[] nums, int left, int right, int pIndex) {
        int pivot = nums[pIndex];
        swap(nums, pIndex, right);
        pIndex = left;

        for (int i=left; i<=right; i++)
            if (nums[i] <= pivot) {
                //保证pindex左边的数一定比pindex上的数小 右边的一定比他大 所以pindex上的这个数一定在正确的位置 然后看这个正确位置上的数是不是正好是我们需要找的k位置上的数
                swap(nums, i, pIndex++);
            }

        return pIndex - 1;
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
