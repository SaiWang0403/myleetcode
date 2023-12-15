import org.junit.Test;
//821
public class ShortestDistancetoaCharacter {
    @Test
    public void test(){
        String s="loveleetcode";
        char c='e';
        int[] res=shortestToChar(s,c);
        for(int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] shortestToChar(String S, char C) {
        //pos=-n初始值没关系  就选-1000 也行 因为i的左边刚开始没有数的话 是多少都没关系 之后查pos-n的时候会算 但是不能太小要大于n的index 所以-n正好
        // AAAAAAAAB 如果假设pos初始是-3 那么res【0】 是3 意思就是0这个位置离它左边最近的c是3个距离  就错了  后面会算是8 结果3反而更小 所以最小设置成8
        int n = S.length(), pos = -n, res[] = new int[n];
        //先假设c 是在现在i这个数的左边 左边是c右边是i  i-pos就计算出现在这个点离左边的c有多远

        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == C) {
                //更新c
                pos = i;
            }
            res[i] = i - pos;
        }
        //上面进行完 pos肯定在最后的c上  左边是i右面是pos 让i递减 pos-i  因为i一直递减 所以计算的是i离右面的c有多远
        //碰到c了 再更新pos的位置 使pos-i pos永远是离i最近的右面的c  计算的永远是i离右面的最近的c有多远
        //取min就行了
        for (int i = pos - 1; i >= 0; --i) {
            if (S.charAt(i) == C)  {
                pos = i;
            }
            res[i] = Math.min(res[i], pos - i);
        }
        return res;
    }
}
