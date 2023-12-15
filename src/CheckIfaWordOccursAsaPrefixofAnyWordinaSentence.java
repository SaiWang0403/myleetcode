import org.junit.Test;
//1455
public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    @Test
    public void test(){
        String s="i love eating burger";
        String searchword="burg";
        int res=isPrefixOfWord(s,searchword);
        System.out.println(res);
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
}
