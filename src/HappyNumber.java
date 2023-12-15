import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//202
    @Test
    public void test(){
        int n=2;
        boolean res=isHappy(n);
        System.out.println(res);
    }

    public boolean isHappy(int n) {
        return recursiveIsHappy(n, new HashSet<>());
    }

    private boolean recursiveIsHappy(int n, Set<Integer> mem) {
        int sumOfSquares = 0;
        while (n != 0) {
            sumOfSquares += Math.pow(n % 10, 2);
            n /= 10;
        }

        if (mem.contains(sumOfSquares)) {
            return false;
        }
        mem.add(sumOfSquares);

        return sumOfSquares == 1 || recursiveIsHappy(sumOfSquares, mem);
    }
}
