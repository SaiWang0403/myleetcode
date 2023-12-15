import org.junit.Test;
//1630
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    @Test
    public void test(){
        int[] nums={4,6,5,9,3,7};
        int[] l={0,0,2};
        int[] r={2,3,5};
        List<Boolean> res=checkArithmeticSubarrays(nums,l,r);
        System.out.println(res);
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int size = l.length;
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i<size; i++){
            int[] subArray = Arrays.copyOfRange(nums,l[i],1+r[i]);
            Arrays.sort(subArray);
            boolean isArithmetic = true;
            int diff = subArray[1] - subArray[0];
            for(int j = 2; j<subArray.length; j++){
                if(subArray[j] - subArray[j-1] != diff){
                    list.add(false);
                    isArithmetic = false;
                    break;
                }
            }
            if(isArithmetic ) list.add(true);
        }
        return list;
    }
}
