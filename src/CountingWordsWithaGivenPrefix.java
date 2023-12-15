import org.junit.Test;
//2185
public class CountingWordsWithaGivenPrefix {
    @Test
    public void test(){
        String[] words={"pay","attention","practice","attend"};
        String pref="at";
        int res=prefixCount(words,pref);
        System.out.println(res);
    }

    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
