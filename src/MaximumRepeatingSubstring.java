import org.junit.Test;
//1668
public class MaximumRepeatingSubstring {
    @Test
    public void test(){
            String sequence="ababc";
            String word="ab";
            int res=maxRepeating(sequence,word);
        System.out.println(res);
    }

    public int maxRepeating(String sequence, String word) {
        int repeating = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            repeating++;
            sb.append(word);
        }
        return repeating;
    }
}
