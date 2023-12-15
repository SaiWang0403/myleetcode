import org.junit.Test;

public class PowerofThree {

    @Test
    public void test(){
        int n=27;
        boolean res=isPowerOfThree(n);
        System.out.println(res);
    }


    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        return true;

    }
}
