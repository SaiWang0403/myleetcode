import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
//2605
public class FormSmallestNumberFromTwoDigitArrays {
    @Test
    public void test(){
        int[] nums1={4,1,3};
        int[] nums2={5,7};
        int res=minNumber(nums1,nums2);
        System.out.println(res);
    }

    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a=nums1[0];
        int b=nums2[0];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                return nums2[i];
            }
        }

        return a>b?b*10+a :a*10+b;
    }
}
