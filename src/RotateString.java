import org.junit.Test;
//796
public class RotateString {
    @Test
    public void test(){
        String A="abcde";
        String B="cdeab";
        boolean res=rotateString(A,B);
        System.out.println(res);
    }
    public boolean rotateString(String A, String B) {
        char bfl = B.charAt(0);
        int len  = A.length();

        for (int i = 0; i < len; i++) {
            if (A.charAt(i) != bfl) continue;

            var suffix = A.substring(i);
            var prefix = A.substring(0, i);

            if (B.equals(suffix + prefix)) return true;
        }

        return false;
    }
}
