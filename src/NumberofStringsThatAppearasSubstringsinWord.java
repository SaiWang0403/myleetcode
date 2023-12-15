import org.junit.Test;
//1967
public class NumberofStringsThatAppearasSubstringsinWord {
    @Test
    public void test(){
        String[] p={"a","abc","bc","d"};
        String word="abc";
        int res=numOfStrings(p,word);
        System.out.println(res);
    }

    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
