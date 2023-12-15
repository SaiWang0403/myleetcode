import org.junit.Test;
//1980
public class FindUniqueBinaryString {
    @Test
    public void test(){
        String[] nums={"01","10"};
        String res=findDifferentBinaryString(nums);
        System.out.println(res);
    }

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
//题里说 Given an array of strings nums containing n unique binary strings each of length n
        //所以length 2 的时候每个string 也是length2 ，length 3 的时候每个string 也是length3 ，length 4 的时候每个string 也是length4
        for(int i=0;i<nums.length;i++)
        {
            //这样就保证每个string里都有一个数和res里的不一样，所以res和每一个string都不一样
            sb.append(nums[i].charAt(i) == '0'? "1": "0");
        }
        return new String(sb);
    }

}
