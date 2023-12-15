import org.junit.Test;
//2652
public class SumMultiples {
    @Test
    public void test(){
        int n=7;
        int res=sumOfMultiples(n);
        System.out.println(res);
    }

    public int sumOfMultiples(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 ||i%7==0){
                res+=i;
            }
        }
        return res;
    }
}
