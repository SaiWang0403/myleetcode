import org.junit.Test;
//2651
public class CalculateDelayedArrivalTime {
    @Test
    public void test(){
        int a=15;
        int d=5;
        int res=findDelayedArrivalTime(a,d);
        System.out.println(res);
    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
}
