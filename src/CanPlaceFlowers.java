import org.junit.Test;
//605
public class CanPlaceFlowers {
    @Test
    public void test(){
        int[] bed={1,0,0,0,1};
        int n=1;
        boolean res=canPlaceFlowers(bed,n);
        System.out.println(res);
    }

    public boolean canPlaceFlowers(int[] bed, int n) {
        int counter = 0;
        for (int i = 0; i < bed.length; i++) {
            int left = i == 0 ? 0 : bed[i - 1];
            int right = i == bed.length - 1 ? 0 : bed[i + 1];
            if (left == 0 && right == 0 && bed[i] == 0) {
                bed[i] = 1;
                counter++;
            }
        }

        return counter >= n;
    }
}
