import org.junit.Test;
//2299
import java.util.ArrayList;

public class StrongPasswordCheckerII {
    @Test
    public void test(){
        String password="aaaaaaaaaaaaaaab";
        boolean res=strongPasswordCheckerII(password);
        System.out.println(res);
    }

    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        boolean lower=false;
        boolean upper=false;
        boolean isD=false;
        boolean isSpe=false;
        String special="!@#$%^&*()-+";
        char p='.';
        for(char c:password.toCharArray()){
            if(c==p){
                return false;
            }
            p=c;
            if(c>='a' && c<='z'){
                lower=true;
            }
            else if(c>='A' &&c<='Z'){
                upper=true;
            }
            else if(Character.isDigit(c)){
                isD=true;
            }
            else if(special.contains(c+"")){
                isSpe=true;
            }

        }
        return lower&&upper&&isD&&isSpe;
    }
}
