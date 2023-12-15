import org.junit.Test;

import java.util.HashMap;

//509
public class FibonacciNumber {
//0 1 1 2 3
    @Test
    public void test(){
        int n=3;
        System.out.println(fibnacciNumber(n));
    }


    public int fibnacciNumber(int n){

       HashMap<Integer,Integer> storemap=new HashMap<>();
        if(n==0) return 0;
        if (n==1) return 1;
        if(storemap.get(n)!=null){
            return storemap.get(n);
        }
        else{
            int res=fibnacciNumber(n-1)+fibnacciNumber(n-2);
            storemap.put(n,res);
            return res;
        }
    }

    //动态规划
    public int fibnacciNumber2(int n){
        if(n<=1){
            return n;
        }
        int[] dp= new int[n+1];

        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+ dp[i-2];
        }
        return dp[n];

    }
}
