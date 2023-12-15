import org.junit.Test;
//2828
import java.util.ArrayList;
import java.util.List;

public class CheckifaStringIsanAcronymofWords {
    @Test
    public void test(){
        ArrayList<String> list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("charlie");
        String s="abc";
        boolean res=isAcronym(list,s);
        System.out.println(res);
    }

    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.size();i++){
            sb.append(words.get(i).charAt(0));
        }
        return sb.toString().equals(s);
    }
}
