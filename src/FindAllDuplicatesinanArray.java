import org.junit.Test;
//442
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    @Test
    public void test(){
        int[] nums={4,3,2,7,8,2,3,1};
        List list=findDuplicates(nums);
        System.out.println(list);

    }

    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int[] arr=new int [n];

        for(int i=0;i<n;i++){
            int x=nums[i];
            arr[x-1]++;
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                l.add(i+1);
            }
        }
        return l;
    }
}
