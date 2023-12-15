import org.junit.Test;

import java.util.HashMap;
//409
public class LongestPalindrome {

    @Test
    public void test(){
        String s="abccccdd";
        int res=longestPalindrome(s);
        System.out.println(res);

    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        // System.out.println(map);
        int sum = 0;
        boolean odd = false;
        for(Character ch : map.keySet()){
            int curr = map.get(ch);
            if(curr%2==0){
                sum+= curr;
            }
            else{
                odd = true;
                sum += curr-1;
            }
        }
        if(odd){
            sum+=1;
        }
        return sum;
    }

}
