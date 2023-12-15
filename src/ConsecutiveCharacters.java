import org.junit.Test;
//1446
public class ConsecutiveCharacters {
    @Test
    public void test(){
        String s="abbccc";
        int res=maxPower(s);
        System.out.println(res);
    }

    public int maxPower(String s) {
        int res=1,c=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else {
                res=Math.max(res,c);
                c=1;
            }
        }
        res=Math.max(res,c);
        return res;
    }
}
