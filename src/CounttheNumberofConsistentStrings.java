import org.junit.Test;
//1684
import java.util.HashSet;

public class CounttheNumberofConsistentStrings {
    @Test
    public void test(){
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        int res=countConsistentStrings(allowed,words);
        System.out.println(res);
    }

    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int total = words.length;

        for(char c: allowed.toCharArray()){
            set.add(c);
        }

        for(String str: words){
            for(char c: str.toCharArray()){
                if(!set.contains(c)){
                    total--;
                    break;
                }
            }
        }

        return total;
    }
}
