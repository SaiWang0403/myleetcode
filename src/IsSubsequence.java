import org.junit.Test;
//392
public class IsSubsequence {

    @Test
    public void test(){
        String s="abc";
        String t="ahbgdc";
        boolean res=isSubsequence(s,t);
        System.out.println(res);
    }


    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        int letter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(letter) == t.charAt(i)) {
                letter++;
                if (letter == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
