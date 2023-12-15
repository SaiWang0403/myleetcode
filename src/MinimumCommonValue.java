import org.junit.Test;
//2540
import java.util.HashSet;

public class MinimumCommonValue {
    @Test
    public void test(){
        int[] nums1={1,2,3};
        int[] nums2={2,4};
        int res=getCommon(nums1,nums2);
        System.out.println(res);
    }

    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}
