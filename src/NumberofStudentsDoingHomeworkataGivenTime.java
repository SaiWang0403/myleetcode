import org.junit.Test;
//1450
public class NumberofStudentsDoingHomeworkataGivenTime {
    @Test
    public void test(){
        int[] startTime={1,2,3};
        int[] endTime={3,2,7};
        int q=4;
        int res=busyStudent(startTime,endTime,q);
        System.out.println(res);
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime &&endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}
