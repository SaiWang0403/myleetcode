import org.junit.Test;
//1768
public class MergeStringsAlternately {
    @Test
    public void test(){
        String word1="abc";
        String word2="pqr";
        String res=mergeAlternately(word1,word2);
        System.out.println(res);
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
