import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame2 {

    @Test
    public void test(){
        int[] arr={2,3,1,2,4,2,3};
        int res=jump(arr);
        System.out.println(res);
    }

    public int jump(int[] a) {
        int l = 0, r = 0;
        if (a.length == 1) return 0;
        int res = 0;
        while (l <= r) {
            res++;
            int R = r;
            for (int i = l; i <= r ; i++) {
                R = Math.max(R, a[i] + i);
                if (R >= a.length - 1) return res;
            }

            l = r +1;
            r = R;
        }

        return -1;
    }

//    public int jump(int[] nums) {
//        int maxPos=0;
//        int end=0;
//        int ans=0;
//        for (int i=0; i<nums.length-1;i++){
//            maxPos=Math.max(maxPos,nums[i]+i);
//            if(i==end){
//                end=maxPos;
//                ans++;
//            }
//        }
//        return ans;
//    }
}
