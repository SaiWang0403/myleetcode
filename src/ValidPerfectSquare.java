import org.junit.Test;

public class ValidPerfectSquare {
    //367
    @Test
    public void test(){
        int num =4;
        boolean res=isPerfectSquare(num);
        System.out.println(res);
    }


    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        if (num < 4) return false;

        int end = num / 2;
        int start = 0;
        int mid;

        while (start <= end) {
            mid = (end - start) / 2 + start;

            double calculated = Math.pow(mid, 2);
            if (calculated == num) return true;

            if (calculated < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;
    }
}
