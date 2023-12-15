import org.junit.Test;
//2465
import java.util.Arrays;
import java.util.HashSet;

public class NumberofDistinctAverages {
    @Test
    public void test(){
        int[] arr={4,1,4,0,3,5};
        int res=distinctAverages(arr);
        System.out.println(res);
    }

    public int distinctAverages(int[] nums) {
        HashSet<Double> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            double temp=(double)(nums[i]+nums[j])/2;
            set.add(temp);
        }
        return set.size();
    }

}
