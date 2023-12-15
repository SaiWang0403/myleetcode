import org.junit.Test;
//1523
public class CountOddNumbersinanIntervalRange {
    @Test
    public void test(){
        int low=3;
        int high=7;
        int res=countOdds(low,high);
        System.out.println(res);
    }

    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0)
            return (high-low)/2;
        else
            return (high-low)/2+1;
    }
}
