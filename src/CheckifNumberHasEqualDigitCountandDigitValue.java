import org.junit.Test;
//2283
import java.util.Hashtable;

public class CheckifNumberHasEqualDigitCountandDigitValue {

    @Test
    public void test(){
        String num="1210111";
        boolean res=digitCount(num);
        System.out.println(res);
    }


    public boolean digitCount(String num) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i = 0; i<num.length(); i++){
            ht.put(i, num.charAt(i)-'0');
        }

        for(int i = 0; i<num.length(); i++){
            if(ht.get(num.charAt(i)-'0')== null){
                return false;
            }
            ht.replace(num.charAt(i)-'0', ht.get(num.charAt(i)-'0')-1);
        }
        for(int i = 0; i<num.length(); i++){
            if(ht.get(i)!=0){
                return false;
            }
        }

        return true;
    }
}
