import org.junit.Test;
//1732
public class FindtheHighestAltitude {
    @Test
    public void test(){
        int[] gain={-5,1,5,0,-7};
        int res=largestAltitude(gain);
        System.out.println(res);
    }

    public int largestAltitude(int[] gain) {
        int altitude = 0, max = 0;

        for (var g : gain) {
            altitude += g;
            max = Math.max(max, altitude);
        }
        return max;
    }
}
