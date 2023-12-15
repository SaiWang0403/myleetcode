import org.junit.Test;

public class ArrangingCoins {

    @Test
    public void test(){
        int n=5;
        int res=arrangeCoins(n);
        System.out.println(res);

    }
    public int arrangeCoins(int n){
        for (int i=1;i<=n;i++){
            n=n-i;
            //也可以n=<i)
            //看还剩下的n 也就是还剩下的硬币 有没有小于下一行要填满需要的硬币 （也就是i+1） 如果小于了 就是填不满下一行 所以返回当前行 如果》= 那就说明还能填满下一行 就接着i+1
            if(n<i+1){
                return i;
            }
        }
        return 0;
    }

    public int arrangeCoins2(int n){
        //把输出的结果看成i 也就是第i行是正确的行 也就是可形成完整阶梯行的总行数 比如 5个硬币 能形成2行完整的阶梯
        //拼出2行阶梯 需要3个硬币 拼出3行阶梯 需要6个硬币
        //n本来是有多少个硬币 把n同时看成行数 正确的行肯定小于n （在n行里面）
        // 二分查找正确的行 如果正确的行 正好能消耗掉n个硬币 就返回正取的行（mid）  如果不能正好消耗 那么因为high是不断变化的 high在帮你记录最大可能消耗的行 所以如果循环结束 那么 high的值就是正确的行 返回high
        int low=0;
        int high=n;
        while (low<=high) {
            int mid=(high+low)/2;
            int cost=((mid +1)*mid)/2;
            if(cost==n){
                return mid;
            }else if(cost>n){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return high;
    }

    //https://www.bilibili.com/video/BV1eg411w7gn?p=80&vd_source=617abaa90bad62ce2d53b4924dbe6aed
    public int arrangeCoins3(int n){
        if(n==0){
            return 0;
        }
        return (int)sqrt(n,n);
    }
    //x看成预估的解 先把他赋值成n 其实可以是任意数
    public static double sqrt(double x,int n){
        double cost=(x+(2*n-x)/x)/2;
        if(cost==x){
            return x;
        }else {
            return sqrt(cost,n);
        }
    }
}
