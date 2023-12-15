import org.junit.Test;
//387
public class FirstUniqueCharacterinaString {
    @Test
    public void test(){
        String s="leetcode";
        int res=firstUniqChar(s);
        System.out.println(res);

    }


    public int firstUniqChar(String s) {
        int result = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
//            System.out.println(c+0);
            int i = s.indexOf(c);
            if (i != -1 && i == s.lastIndexOf(c)) {
                result = Math.min(result, i);
            }
        }
        return result == s.length() ? -1 : result;
    }
}
