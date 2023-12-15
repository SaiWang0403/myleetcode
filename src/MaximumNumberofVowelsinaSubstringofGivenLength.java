import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//1456
public class MaximumNumberofVowelsinaSubstringofGivenLength {
    @Test
    public void test(){
            String s="abciiidef";
            int k=3;
            int res=maxVowels(s,k);
        System.out.println(res);
    }

    public int maxVowels(String s, int k) {
        List<Character> v = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Set<Character> vowels = new HashSet<Character>(v);

        int vcount =0;
        for(int i=0 ;i<k; i++){
            if(vowels.contains(s.charAt(i))) {
                vcount++;
            }
        }

        int max = vcount;
        int left =0;
        int right = k-1;
        while(right<s.length()-1){
            if(vowels.contains(s.charAt(left))) {
                vcount--;
            }
            left++;
            right++;
            if(vowels.contains(s.charAt(right))) {
                vcount++;
            }
            max = Math.max(max, vcount);
        }

        return max;
    }
}
