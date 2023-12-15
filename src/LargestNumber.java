import org.junit.Test;
//179
import java.util.Arrays;

public class LargestNumber {
    @Test
    public void test(){
        int[] nums={30,3,34,5,9};
        String res=largestNumber(nums);
        System.out.println(res);
    }

    public String largestNumber(int[] nums) {
        String s[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(s,(a, b)->(b+a).compareTo(a+b));
        for(String str:s)
        {
            sb.append(str);
        }
        String result=sb.toString();
        return result.startsWith("0")?"0":result;
    }
}
