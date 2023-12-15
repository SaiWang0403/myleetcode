import org.junit.Test;

public class ReverseString {
    @Test
    public void test(){
        String s="abc";
        System.out.println(reverse2(s));
    }

    public String reverse(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }

        return res;
    }

    public String reverse2(String s){
        StringBuilder sb =new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
