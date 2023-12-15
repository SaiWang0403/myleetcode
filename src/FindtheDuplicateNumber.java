import org.junit.Test;
//287
public class FindtheDuplicateNumber {
    @Test
    public void test(){
        int[] nums={1,3,4,2,2};
        int res=findDuplicate(nums);
        System.out.println(res);
    }
    //Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    //最大数 是这个数组长度-1 例如如果长度是5 那里面最大数就是4
    //所以数组里的每个数都可以指向 数组里的一个数
    //把被指的数标记成负数 如果这个数被指了两次那就说明这个数是重复的
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int abs = Math.abs(nums[i]);
            if(nums[abs] < 0)
                return abs;
            nums[abs] = -nums[abs];
        }
        return 0;
    }

}
