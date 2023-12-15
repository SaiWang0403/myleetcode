import org.junit.Test;
//2000
public class ReversePrefixofWord {
    @Test
    public void test(){
        String word="abcd";
        char ch='z';
        String res=reversePrefix(word,ch);
        System.out.println(res);
    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        return new StringBuilder(word.substring(0,index+1))
                .reverse()
                .append(word.substring(index+1,word.length()))
                .toString();

    }
}
