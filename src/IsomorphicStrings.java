import org.junit.Test;
//205
import java.util.HashMap;

public class IsomorphicStrings {
    @Test
    public void test(){
        String s="egg";
        String t="add";
        boolean res=isIsomorphic(s,t);
        System.out.println(res);
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> stot=new HashMap<>();
        HashMap<Character,Character> ttos=new HashMap<>();

        char[] schararr=s.toCharArray();
        char[] tchararr=t.toCharArray();
        for(int i=0;i<s.length();i++){
            char schar=schararr[i];
            char tchar=tchararr[i];

            if(!stot.containsKey(schar)){
                stot.put(schar,tchar);
            }
            if(!ttos.containsKey(tchar)){
                ttos.put(tchar,schar);
            }

            if(!stot.get(schar).equals(tchar)  || !ttos.get(tchar).equals(schar)){
                return false;
            }

        }
        return true;
    }
}
