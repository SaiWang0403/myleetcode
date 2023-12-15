import org.junit.Test;
//2427
public class NumberofCommonFactors {
    @Test
    public void test(){
        int a=12;
        int b=6;
        int res=commonFactors(a,b);
        System.out.println(res);
    }

    public int commonFactors(int a, int b) {
        int count =0;
        int min=Math.min(a,b);
        for(int i =1;i<=min;i++){
            if(a%i==0 && b%i==0) {
                count++;

            }
        }
        return count;
    }
}
