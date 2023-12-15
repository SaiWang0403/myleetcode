import org.junit.Test;
//1004
public class MaxConsecutiveOnesIII {
    @Test
    public void test(){
        int[] arr= {0,1,1,0,1,0};
        int k=1;
        int res=longestOnes(arr,k);
        System.out.println(res);
    }

    public int longestOnes(int[] nums, int k) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        int start = 0;
        int end = 0;
        int zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
//当一不可以的时候 就平移整个窗口（start，end都加1） 这样就保持了之前可以的窗口的size
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
            end++;
        }

        return end - start;
    }
}
