import org.junit.Test;
//2744
import java.util.HashMap;

public class FindMaximumNumberofStringPairs {
    @Test
    public void test(){
        String[] words={"cd","dc"};
        int res=maximumNumberOfStringPairs(words);
        System.out.println(res);
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int res=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String r=new StringBuilder(words[i]).reverse().toString();
            if(map.containsKey(r)){
                map.put(words[i],map.get(r)+1);
            }else{
                map.put(words[i],0);
            }
        }
        for(int value :map.values()){
            res+=value;
        }
        return res;
    }
}
