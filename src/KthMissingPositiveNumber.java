import org.junit.Test;
//1539
public class KthMissingPositiveNumber {
    @Test
    public void test(){
            int[] arr={2,3,4,7,11};
            int k=5;
            int res=findKthPositive(arr,k);
        System.out.println(res);
    }

    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //arr[mid] - mid - 1 比如arr【2】是4  4-2-1  就是4这个点上本来应该有4个数 结果mid看出来 4之前只有2个数 再减去4本身这一个数 （这三个是事实上有的）
            //剪完后就是还应该有的 就是1个数
            if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //left就是现在有的数 + k是还差的数  就是正常顺序下到的那个数
        return left + k;
    }
}
