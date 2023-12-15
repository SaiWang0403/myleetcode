import org.junit.Test;
//2798
public class NumberofEmployeesWhoMettheTarget {
    @Test
    public void test(){
        int[] arr={0,1,2,3,4};
        int target=2;
        int res=numberOfEmployeesWhoMetTarget(arr,target);
        System.out.println(res);
    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}
