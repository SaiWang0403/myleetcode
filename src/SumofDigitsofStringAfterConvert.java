import org.junit.Test;
//1945
public class SumofDigitsofStringAfterConvert {
    @Test
    public void test(){
        String s="zbax";
        int k=2;
        int res=getLucky(s,k);
        System.out.println(res);
    }

    public int getLucky(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i)-'a'+1;
            String st=String.valueOf(temp);
            res+=st;
        }
        int tres=0;
        while(k>0){
            int t=0;
            for(int i=0;i<res.length();i++){
                t+=res.charAt(i)-'0';

            }
            res=String.valueOf(t);
            k--;
            tres=t;
        }
        return tres;
    }
}
