import org.junit.Test;
//2215
import java.util.*;

public class FindtheDifferenceofTwoArrays {

    @Test
    public void test(){
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        List<List<Integer>> res=findDifference(nums1,nums2);
        System.out.println(res);
    }


    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int i: nums1)    s1.add(i);
        Set<Integer> s2 = new HashSet<>();
        for(int i: nums2)    s2.add(i);
        Set<Integer> common = new HashSet<>();
        for(int i: s1){
            if(s2.contains(i)) {
                common.add(i);
            }
        }
        //从一个hashset里 删除另一个hashset 用remove 不行 删不掉
        s1.removeAll(common);
        s2.removeAll(common);
        return Arrays.asList(new ArrayList<>(s1), new ArrayList<>(s2));
    }
}
