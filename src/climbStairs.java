import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
//70
public class climbStairs {

    @Test
    public void test(){
        int n=5;
        System.out.println(climbstairs(n));
    }

    private Map<Integer,Integer> storeMap=new HashMap<>();
    public int climbstairs(int n){
//        if(n==1) return 1;
//        if(n==2) return 2;
//
//        int result=0;
//        int pre=2;
//        int prePre=1;
//        for (int i=3;i<=n;i++){
//            result=pre+prePre;
//            prePre=pre;
//            pre=result;
//        }
//        return result;

        if(n==1) return 1;
         if(n==2) return 2;
         if(null !=storeMap.get(n)){
             return storeMap.get(n);
         }
         else {
             int result=climbstairs(n-1)+climbstairs(n-2);
             storeMap.put(n,result);
             return result;
         }

    }
}
