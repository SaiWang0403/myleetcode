import org.junit.Test;
//349
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

    @Test
    public void test(){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] res=intersection(nums1,nums2);
        for (int n :res){
            System.out.println(n);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums1) {
            s.add(num);
        }
        Set<Integer> t = new HashSet<>();
        for (int num : nums2) {
            if (s.contains(num)) {
                t.add(num);
            }
        }
        int[] res = new int[t.size()];
        int i = 0;
        for (int num : t) {
            res[i++] = num;
        }
        return res;
    }
}
