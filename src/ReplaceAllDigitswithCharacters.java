import org.junit.Test;
//1844
public class ReplaceAllDigitswithCharacters {
    @Test
    public void test(){
        String s="a1c1e1";
        String res=replaceDigits(s);
        System.out.println(res);
    }

    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97){
                sb.append(s.charAt(i)+"");
            }else{
                sb.append((char)  (s.charAt(i-1)+(s.charAt(i)-'0'))+"");
            }
        }
        return sb.toString();
    }
}
