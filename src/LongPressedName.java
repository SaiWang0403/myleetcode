import org.junit.Test;
//925
public class LongPressedName {
    @Test
    public void test(){
        String name="alex";
        String typed="aaleex";
        boolean res=isLongPressedName(name,typed);
        System.out.println(res);
    }

    public boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()) return false;
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            if(j < n.length && t[i] == n[j]) {
                j++;
            } else if( j == 0 || n[j-1] != t[i]) {
                return false;
            }
        }
        return j == n.length;
    }
}
