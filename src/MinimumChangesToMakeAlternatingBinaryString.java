import org.junit.Test;
//1758
public class MinimumChangesToMakeAlternatingBinaryString {
    @Test
    public void test(){
        String s="0100";
        int res=minOperations(s);
        System.out.println(res);
    }

    public int minOperations(String s) {
        //不是0101 （start from 0）这么排序的 那便是 1010 （start from 1） 这样排序
        //c0表示 要改正 0101 这样排序的 需要几次改动
        int c0 = 0;
        //c1表示 要改成 1010 这样排序的  需要几次改动
        int c1 = 0;
        for(int i=0; i<s.length(); i++){
            //i%2 就表示0101 这么排序的
            //如果 ！=i%2 便说明不是按照0101 这么排序的 那么c0便要加一
            if(s.charAt(i) - '0' != i%2) //start from 0
                c0++;
            else //start from 1 ((i+1)%2)
                c1++;
        }
        return Math.min(c1, c0);
    }
}
