import org.junit.Test;
//1704
public class DetermineifStringHalvesAreAlike {
    @Test
    public void test(){
        String s="book";
        boolean res=halvesAreAlike(s);
        System.out.println(res);
    }

    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int vowelCount = 0;
        int stringLength = s.length();
        for(int i = 0; i < stringLength / 2; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }
        for(int j = stringLength / 2; j <stringLength; j++) {
            if (isVowel(s.charAt(j))) {
                vowelCount--;
            }
        }
        if (vowelCount == 0) {
            return true;
        }
        return false;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
