import org.junit.Test;

public class NimGame {

    @Test
    public void test(){
        int n=8;
        boolean res=canWinNim(n);
        System.out.println(res);
    }

    public boolean canWinNim(int n) {
        if(n <= 0)
            throw new IllegalArgumentException();
        if(n < 4)
            return true;
        boolean[] res = new boolean[n + 1];
        res[0] = true;
        res[1] = true;
        res[2] = true;
        res[3] = true;
        for(int i = 4 ; i <= n ; i++)
            res[i] = !(res[i - 1] && res[i - 2] && res[i - 3]);
        return res[n];
    }

//    public boolean canWinNim(int n) {
//        if (n % 4 == 0) {
//            return false;
//        }
//        return true;
//    }
}
