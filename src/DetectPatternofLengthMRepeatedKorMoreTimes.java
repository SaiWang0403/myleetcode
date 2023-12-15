import org.junit.Test;
//1566
public class DetectPatternofLengthMRepeatedKorMoreTimes {
    @Test
    public void test(){
        //4 4 4 有3个数 可是count只需要2次就可证明这3个数相同  所以要 一共要count （k-1）组
        //要乘m 因为要count到每一组数的最后一位 像是456是一组 456是一组 我们每次要count到6  4567是一组 4568是一组 每次要count到7 也就是这组最后
        //所以（k-1）是一共要count几组 m每组里要count几次
        // 456是一组 456是一组 456是一组的话  就要count (k-1) 也就是2组 （即可证明三组相同）  然后每组要count 3次 每次loop到6 所以一共是m*（k-1） 次count 就会是6次
            int[] arr={4,5,6,4,5,7};
            int m=3;
            int k=2;
            boolean res=containsPattern(arr,m,k);
        System.out.println(res);
    }

    public boolean containsPattern(int[] arr, int m, int k) {
        var count = 0;
        for (int i = 0, j = i + m; j < arr.length; i++, j++) {
            if (arr[i] != arr[j]) {
                count = 0;
            }
            else if (++count ==  m*(k-1)) {
                return true;
            }
        }
        return false;
    }
}
