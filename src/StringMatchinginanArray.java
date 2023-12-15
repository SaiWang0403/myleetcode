import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinginanArray {
    @Test
    public void test(){
        String[] arr={"mass","as","hero","superhero"};
        List<String> res=stringMatching(arr);
        System.out.println(res);
    }

    public List<String> stringMatching(String[] words) {
        String str=String.join(" ",words);
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                list.add(words[i]);
            }
        }
        return list;
    }
}
