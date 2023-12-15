import org.junit.Test;
//1502
import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    @Test
    public void test(){
        int[] arr={3,5,1};
        boolean res=canMakeArithmeticProgression(arr);
        System.out.println(res);
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=diff){
                return false;
            }
        }
        return true;
    }
}
