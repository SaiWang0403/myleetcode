import org.junit.Test;
//69
public class SqrtX {

    @Test
    public void test(){
        int num=12;
        int res=sqrtx(num);
//        int res2=newton(num);
        System.out.println(res);
//        System.out.println(res2);
    }
//二分
    public int sqrtx(int x){
        int index=0, l=1,r=x;
        //要加=号 例如 input只有1
        while (l<=r) {
            int mid=(l+r)/2;
            //不能mid * mid <=x 因为如果mid太大 mid*mid 反而会是负数
            if(mid  <=x/mid){
                //下面两行话可以颠倒位置
                //要在这时赋值而不是 MID >= X/MID 时赋值，因为总是取小的那个值 比如根号8 是2.8 取2， 而不是取3 如果取大的值就在下面MID >= X/MID 时赋值
                //因为如果2.8的话 这种情况就是先赋值2， 然后left+1 判断右边，而右边不会赋值，所以保持2
                index=mid;
                l=mid+1;
            }else {

                r=mid-1;
            }

        }
        return index;
    }

//牛顿迭代
    public int newton(int x){
        if(x==0){
            return 0;
        }
        //左边的x可以为任意数，右边x是12
        return  (int)sqrtx2(x,x);

    }

    //12 可以是 2*6 3*4 根号12 * 根号12 4*3 6*2
    // 把 左边的数看成 i1 右边的看成i2   所以只要i1和i2相等 那么 i1和i2的这个数（根号12） 必然是12 的平方根 所以问题就是找i1和i2 相等的那个数
    //如何找 就是一直找 i1 和 i2 的平均数，直到这个平均数是根号12
    //比如 我先把i1 赋值成 2 那么i2 是 6， 这时候2不等于6 那么我取2 和6的平均数 res=4， 4 必然更接近于根号12 这就是牛顿迭代
    //然后 res 4 成为新的i1， i2就是12/4 = 3 然后循环取i1 和i2 的平均数
    //倒数第二次 res会是根号12， 根号12成为新的i1 ， i2 也是根号十二， 新的res 就是两个根号12 的平均数 ， 还是根号12， 所以新的res等于i（也就是上一把旧的res）返回这个i 的值（或者返回这时候res的值 都一样）

    public double sqrtx2(double i, int x){
        //i可以看成i1 （也就是预估的解） x/i可以看成i2 res就是他俩的平均数
        //12 1 6.5
        //6.5 1.8  4.17
        //4.17 2.8 3.5
        //3.5 3.4 3.46
        // ...
        //..  ..  3.46410
        //i1 3.46410   i2 3.46410   res3.46410  res 和i1 ， i2 都相等了  也就是根号12   取res 或者上一个res（现在的i1）
        // x是12 也就是要求取平方根的数  i可以是任意数 主旨就是i1乘i2 要等于12 也就是要求取平方根的数 然后找i1 i2 的平均值 这样就会慢慢接近根号12
        //以后别的题要求平方根的时候 就把x 替换就行 还是套用牛顿迭代方法 也就是(i+x/i)/2;

        double res= (i+x/i)/2;

        //不能res==x/i  I 和 X/I 应该是完全相等的 但是因为是无限不循环 所以x/I 可能比I 的位数多 （也就是i2 比i1 位数多） 但平均数res 会等于i1 因为他俩double精度极限一样
        if(res == i){
            //也可以返回res
            return i;
        }
        else {
            return sqrtx2(res,x);
        }
    }
}
