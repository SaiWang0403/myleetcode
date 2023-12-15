import org.junit.Test;
//2255
public class CountPrefixesofaGivenString {
    @Test
    public void test(){
        String[] words={"a","b","c","ab","bc","abc"};
        String s="abc";
        int res=countPrefixes(words,s);
        System.out.println(res);
    }

    public int countPrefixes(String[] words, String s) {
        int res=0;
        for(int i=0;i<words.length;i++){
            if(s.startsWith(words[i])){
                res++;
            }
        }
        return res;
    }
}
