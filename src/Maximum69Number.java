import org.junit.Test;

public class Maximum69Number {
    @Test
    public void test(){
        int num=9669;
        int res=maximum69Number(num);
        System.out.println(res);
    }

    public int maximum69Number (int num) {
        char[] s = Integer.toString(num).toCharArray();
        for(int i = 0; i < s.length; i++) {
            if(s[i] == '6') {
                s[i] = '9';
                break;
            }
        }
        return Integer.valueOf(new String(s));
    }
}
