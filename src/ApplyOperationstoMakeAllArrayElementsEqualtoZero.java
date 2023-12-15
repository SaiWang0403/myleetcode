import org.junit.Test;
//2772
public class ApplyOperationstoMakeAllArrayElementsEqualtoZero {
    @Test
    public void test(){
        int[] nums={2,3,4,1};
        int k=3;
        boolean res=checkArray(nums,k);
        System.out.println(res);
    }

    public boolean checkArray(int[] A, int k) {
        int cur = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            //因为三个数的window 必须是递增的或者持平的 比如234 和233 如果231 肯定就不行
            //234 的时候2先不变 到3先减去2 cur补上3和2差的1 ，所以到4的时候就减去3 剩下的差值以后的cur减掉  如果最后cur是0 那么正好全减掉了
            if (cur > A[i])
                return false;
            A[i] -= cur;
            cur += A[i];
            //每三个数是一个window， cur记录着现在到的数的这个时候的sum最大的值 比如过了第一个3的时候cur就是3
            //可是到了第一个3的时候（nums【i】） 要减去之前的cur 这样就还残留着这个位置比前面的位置的差 过了第三个数的时候要把这个差减掉 就剩下三个数最大数减最小数的差
            //第三个是到这里的时候要移除第一个数之前残留的差 这样新的cur 才是第四个数要用的cur 也就是必须要减的cur
            if (i >= k - 1)
                cur -= A[i - k + 1];
        }
        return cur == 0;
    }
}
