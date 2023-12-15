import org.junit.Test;
//2032

import java.util.*;

public class TwoOutofThree {
    @Test
    public void test(){
        int[] nums1={1,1,3,2};
        int[] nums2={2,3};
        int[] nums3={3};
        List<Integer> res=twoOutOfThree(nums1,nums2,nums3);
        System.out.println(res);
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int n1 = nums1.length , n2 = nums2.length , n3 = nums3.length;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n1 ; i++){
            if(set1.add(nums1[i])){
                map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
            }
        }
        for(int i = 0 ; i < n2 ; i++){
            if(set2.add(nums2[i])){
                map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);
            }
        }
        for(int i = 0 ; i < n3 ; i++){
            if(set3.add(nums3[i])){
                map.put(nums3[i], map.getOrDefault(nums3[i],0)+1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>=2){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
