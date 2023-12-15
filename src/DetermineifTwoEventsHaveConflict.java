import org.junit.Test;
//2446
public class DetermineifTwoEventsHaveConflict {
    @Test
    public void test(){
        String[] e1={"01:15","02:00"};
        String[] e2={"02:01","03:00"};
        boolean res=haveConflict(e1,e2);
        System.out.println(res);
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        int endTime1StartTime2 = event2[0].compareTo(event1[1]);
        int startTime1EndTime2 = event2[1].compareTo(event1[0]);
        return (endTime1StartTime2 <= 0) && (startTime1EndTime2 >= 0);
    }
}
