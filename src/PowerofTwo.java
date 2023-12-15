import org.junit.Test;

public class PowerofTwo {
    //231
    @Test
    public void test(){
        int n=2;
        boolean res=isPowerOfTwo(n);
        System.out.println(res);

    }

    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
