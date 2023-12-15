import org.junit.Test;
//1832
import java.util.HashSet;

public class CheckiftheSentenceIsPangram {
    @Test
    public void test(){
        String s="thequickbrownfoxjumpsoverthelazydog";
        boolean res=checkIfPangram(s);
        System.out.println(res);
    }

    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}
