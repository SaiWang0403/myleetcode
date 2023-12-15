import org.junit.Test;
//338
// 0&0=0 1&1=1  1&0=0
// 给个数n， 求0到n的每个数的二进制中1的个数，把个数放进数组 返回数组
public class CountBits {
// 求21 的 二进制中的1 的个数 就是再求 21&20 的数（是20）的 二进制中的1 的个数 再 加1
    //求20的二进制中的1 的个数 就是再求 20&19 的数（是16）的 二进制中的1 的个数 再 加1
    //求16的 二进制中的1 的个数 也就是求 16&15 （是0） 的 二进制中的1 的个数 再 加1
    // 0的 二进制中的1 的个数 是0
    @Test
    public void test(){
        int i=21;
        int[] arr= countBits(i);
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

    public int[] countBits(int num){
        int[] bits=new int[num+1];
        for (int i=1;i<=num;i++){
            bits[i]=bits[i&(i-1)]+1;
        }
        return bits;
    }
}
