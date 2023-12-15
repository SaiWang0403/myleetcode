import org.junit.Test;
//496
public class NextGreaterElementI {
    @Test
    public void test(){
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] res=nextGreaterElement(nums1,nums2);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int a = 0; a<nums1.length;a++)
        {
            ans[a] = findGreater(nums1[a], nums2);
        }

        return ans;
    }

    private int findGreater(int target, int[] nums)
    {
        int index=0;
        for(int i = 0;i<nums.length;i++)
            if(nums[i] == target)
                index = i;
        for(int i = index+1;i<nums.length;i++)
            if(nums[i]>target)
                return nums[i];
        return -1;
    }
}
