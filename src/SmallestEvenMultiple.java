import org.junit.Test;
//2413
public class SmallestEvenMultiple {
    @Test
    public void test(){
        int n=5;
        int res=smallestEvenMultiple(n);
        System.out.println(res);
    }

    public int smallestEvenMultiple(int n) {

        if(n%2!=0){
            return n*2;
        }else{
            return n;
        }
    }
}
