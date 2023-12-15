import org.junit.Test;
//2485
public class FindthePivotInteger {
    @Test
    public void test(){
        int n=8;
        int res=pivotInteger(n);
        System.out.println(res);
    }

    public int pivotInteger(int n) {
        int sum=(n*(n+1))/2;
        int left=0;
        for(int i=0;i<=n;i++){
            left+=i;
            if(left==sum-left+i){
                return i;
            }
        }
        return -1;
    }
}
