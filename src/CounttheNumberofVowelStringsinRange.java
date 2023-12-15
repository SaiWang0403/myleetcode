import org.junit.Test;
//2586
public class CounttheNumberofVowelStringsinRange {
    @Test
    public void test(){
        String[] words={"are","amy","u"};
        int left=0;
        int right=2;
        int res=vowelStrings(words,left,right);
        System.out.println(res);
    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
