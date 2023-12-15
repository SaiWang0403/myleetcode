import org.junit.Test;
//2231
public class LargestNumberAfterDigitSwapsbyParity {
    @Test
    public void test(){
        int n=1234;
        int res=largestInteger(n);
        System.out.println(res);
    }

    public int largestInteger(int n) {
        char[] a = String.valueOf(n).toCharArray();
        for(int i = 0; i < a.length; i++)
            for(int j = i + 1; j < a.length; j++)
                if(a[j] > a[i] && (a[j] - a[i]) % 2 == 0){
                    char t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
        return Integer.parseInt(new String(a));
    }
}
