import org.junit.Test;
//2114
public class MaximumNumberofWordsFoundinSentences {
    @Test
    public void test(){
        String[] s={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int res=mostWordsFound(s);
        System.out.println(res);
    }

    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            String[] sub=sentences[i].split(" ");
            count=Math.max(count,sub.length);
        }
        return count;
    }
}
