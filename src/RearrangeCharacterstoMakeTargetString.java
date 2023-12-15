import org.junit.Test;
//2287
public class RearrangeCharacterstoMakeTargetString {
    @Test
    public void test(){
        String s="abcba";
        String target="abc";
        int res=rearrangeCharacters(s,target);
        System.out.println(res);
    }

    public int rearrangeCharacters(String s, String target) {
        int[] freq = new int[26], freq2 = new int[26];
        for(char ch : s.toCharArray())
            freq[ch-'a']++;
        for(char ch : target.toCharArray())
            freq2[ch-'a']++;

        int min = Integer.MAX_VALUE;
        for(char ch : target.toCharArray())
            min = Math.min(min,freq[ch-'a']/freq2[ch-'a']);

        return min;
    }
}
