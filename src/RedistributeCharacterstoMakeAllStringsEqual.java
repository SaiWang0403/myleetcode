import org.junit.Test;
//1897
import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacterstoMakeAllStringsEqual {
    @Test
    public void test(){
        String[] words={"abc","aabc","bc"};
        boolean res=makeEqual(words);
        System.out.println(res);
    }

    public boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for(String s:words){
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(int num:map.values()){
            if(num%words.length!=0){
                return false;
            }
        }
        return true;
    }
}
