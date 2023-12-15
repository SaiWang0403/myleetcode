import org.junit.Test;
//2810
public class FaultyKeyboard {
    @Test
    public void test(){
        String s="string";
        String res=finalString(s);
        System.out.println(res);
    }

    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
