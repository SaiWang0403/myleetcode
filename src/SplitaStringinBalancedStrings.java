import org.junit.Test;
//1221
public class SplitaStringinBalancedStrings {
    @Test
    public void test(){
        String s="RLRRLLRLRL";
        int res=balancedStringSplit(s);
        System.out.println(res);
    }
    public int balancedStringSplit(String s) {
        int count =0;
        int flag = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='R')count++;
            if(s.charAt(i)=='L')count--;
            if(count ==0) flag++;
        }
        return flag;
    }
}
