import org.junit.Test;

public class PowerofFour {

    @Test
    public void test(){
        int n=16;
        boolean res=isPowerOfFour(n);
        System.out.println(res);
    }

    public boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%4!=0){
                return false;
            }
            n=n/4;
        }
        return true;
    }
}
