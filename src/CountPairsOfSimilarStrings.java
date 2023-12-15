import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class CountPairsOfSimilarStrings {
    @Test
    public void test(){
        String[] words={"aba","aabb","abcd","bac","aabc"};
        int res=similarPairs(words);
        System.out.println(res);
    }

    public int similarPairs(String[] words) {
        for(int i=0;i<words.length;i++){
            HashSet<Character> set=new HashSet<>();
            for(char c:words[i].toCharArray()){
                set.add(c);
            }
            String temp="";
            Iterator<Character> itr=set.iterator();
            while(itr.hasNext()){
                temp+=Character.toString(itr.next());
            }
            words[i]=temp;
        }
        int res=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    res++;
                }
            }
        }
        return res;
    }
}
