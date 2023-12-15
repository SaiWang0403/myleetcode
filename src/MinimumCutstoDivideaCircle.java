import org.junit.Test;
//2481
public class MinimumCutstoDivideaCircle {
    @Test
    public void test(){
        int n=4;
        int res=numberOfCuts(n);
        System.out.println(res);
    }

    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
    }
}
