import org.junit.Test;
//2697
public class LexicographicallySmallestPalindrome {
    @Test
    public void test(){
        String s="bhh";
        String res=makeSmallestPalindrome(s);
        System.out.println(res);
    }

    public String makeSmallestPalindrome(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] < arr[j]) {
                arr[j--] = arr[i++];
            } else {
                arr[i++] = arr[j--];
            }
        }
        return new String(arr);
    }
}
