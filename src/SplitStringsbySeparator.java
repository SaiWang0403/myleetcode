import org.junit.Test;
//2788
import java.util.ArrayList;
import java.util.List;

public class SplitStringsbySeparator {
    @Test
    public void test(){
        List<String> list=new ArrayList<>();
//        list.add("one.two.three");
//        list.add("four.five");
//        list.add("six");
        list.add("$easy$");
        list.add("$problem$");
        char seperartor='$';
        List<String> res=splitWordsBySeparator(list,seperartor);
        for (String s:res){
            System.out.println(s);
        }
    }

    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> ret=new ArrayList<>();
        for(String s :words){
            //“[” 和“]” 中间加上char 就可以split 这个char了即使这个char是特殊字符像是 '.' 要不然只能split string
            //It is because the separator which is given in this question has a special meanings and known as metacharacters in Java regex patterns . So to ensuring that the separator is treated as a regular character and not as a regex metacharacter we do this ("["+separator+"]").
            String[] temp=s.split("["+separator+"]");
            for(String ss:temp){
                //因为如果把特殊字符seperator放在最前面或者最后面 那么spilit的时候会有empty string
                if(ss.length()>=1)ret.add(ss);
            }
        }
        return ret;

    }
}
