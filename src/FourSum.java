import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
//18
    @Test
    public void test(){
        int[] nums={1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> res=fourSum(nums,-294967296);
        System.out.println(res);

    }


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int l=j+1;
                int r=n-1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] +nums[l]+nums[r];
                    if(sum <target){
                        l++;
                    }
                    else if(sum >target){
                        r--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while(l<r && nums[l]==nums[l+1]){
                            l++;
                        }
                        l++;
                    }
                }
                while(j+1 <n && nums[j]==nums[j+1]){
                    j++;
                }

            }
            while(i+1 <n && nums[i]==nums[i+1]){
                i++;
            }
        }
        return res;
    }

//    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE); // 2 * 10^9
//        System.out.println(Integer.MIN_VALUE); // -2 * 10^9
//        System.out.println(Long.MAX_VALUE);  // 9 * 10^18
//        System.out.println(String.valueOf(Long.MAX_VALUE).length());
//        System.out.println(Long.MIN_VALUE);  // -9 * 10^18
//
//        System.out.println("Integer.MIN_VALUE - 1 == Integer.MAX_VALUE = " + (Integer.MIN_VALUE - 1 == Integer.MAX_VALUE));
//    }
}
