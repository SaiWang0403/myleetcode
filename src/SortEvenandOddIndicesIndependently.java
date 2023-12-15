import org.junit.Test;
//2164
import java.util.ArrayList;
import java.util.Collections;

public class SortEvenandOddIndicesIndependently {
    @Test
    public void test(){
        int[] nums={4,1,2,3};
        int[] res=new int[nums.length];
        res=sortEvenOdd(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);
        int[] res=new int[nums.length];
        int evenbegin=0;
        int oddbegin=odd.size()-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=even.get(evenbegin++);
            }else{
                res[i]=odd.get(oddbegin--);
            }
        }
        return res;
    }
}
