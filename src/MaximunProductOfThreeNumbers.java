import org.junit.Test;

public class MaximunProductOfThreeNumbers {

    @Test
    public void test(){
        int[] arr={1,-3,-2,7,8};
        int res=maximunProductOfThreeNumbers(arr);
        System.out.println(res);
    }

    //线性扫描
    //如果 数组里的数都是正数 或 都是 负数 那么数组中3个数的最大乘积 肯定是 第一大的数 * 第二大的数 * 第三大的数
    //如果像 -2， 3， 4， 5 肯定也是最大三个数的乘积
    //如果负数>=2 个  像是 -3， -2， 1， 4 则是 第一小的数 * 第二小的数 *最大数
    // 像是-3， -2， 1， 99 ，100 还是第一大的数 * 第二大的数 * 第三大的数
    // 所以需要比较第一小的数 * 第二小的数 *最大数   和   第一大的数 * 第二大的数 * 第三大的数 取大的那个

    public int maximunProductOfThreeNumbers(int[] arr){
        int min1=Integer.MAX_VALUE;int min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE; int max2=Integer.MIN_VALUE; int max3=Integer.MIN_VALUE;

        for (int x : arr){
            if(x <min1){
                min2 =min1;
                min1 =x;
            } else if(x < min2){
                min2=x;
            }
            if(x> max1){
                max3=max2;
                max2=max1;
                max1=x;
            }
            else if(x>max2){
                max3=max2;
                max2=x;
            }
            else if(x>max3){
                max3=x;
            }
        }
            return Math.max(min1*min2*max1,max1*max2*max3);
    }
}
