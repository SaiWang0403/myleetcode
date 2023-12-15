import org.junit.Test;
//9
public class isPalindrome {

    @Test
    public void test(){
        int x=12321;
        System.out.println(ispalindrome(x));

    }

    public boolean ispalindrome(int x){
        if(x<0){
            return false;
        }

        String y=x+"";
        int len=y.length()/2;

        for (int i=0;i<len;i++){

            char v1=y.charAt(i);
            char v2=y.charAt(y.length()-1-i);
            if(v1!=v2){
                return false;
            }
        }

        return true;
    }
}
