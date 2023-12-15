import org.junit.Test;

import java.util.HashMap;
//3
public class LongestSubstringWithoutRepeatingCharacters {

    @Test
    public void test(){
        String s="abcba";
        int res=lengthOfLongestSubstring(s);
        System.out.println(res);
    }
//滑动窗口
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int res=0;
        while (right<s.length()){
            char c=s.charAt(right++);
            map.put(c,map.getOrDefault(c,0)+1);
            //当现在窗口是abcb  map里b的值是2 那么要左窗口从头（index=0）开始向右滑 并且要把 左指针本来在的那个位置的元素的值-1，因为既然划走了 被划走的元素map里对应的值也要-1，这样以后如果新的元素（a）还是这个元素（a） 不影响这个元素值的判断
            while (map.get(c)>1){
                char l=s.charAt(left++);
                map.put(l,map.getOrDefault(l,0)-1);

            }
            res=Math.max(res,right-left);

        }
        return res;
    }
}
