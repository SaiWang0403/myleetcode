import org.junit.Test;
//917
public class ReverseOnlyLetters {
    @Test
    public void test(){
        String s="a-bC-dEf-ghIj";
        String res=reverseOnlyLetters(s);
        System.out.println(res);
    }

    public String reverseOnlyLetters(String S) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = S.length() - 1;
        while(i < S.length()) {
            if (Character.isLetter(S.charAt(i))) {
                while(!Character.isLetter(S.charAt(j))){
                    j--;
                }

                str.append(S.charAt(j--));
                i++;
            } else {
                str.append(S.charAt(i++));
            }
        }
        return str.toString();
    }
}
