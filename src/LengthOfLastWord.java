import org.junit.Test;

public class LengthOfLastWord {

    @Test
    public void test(){
        String s="Hello World ";
        int res=lengthOfLastWord(s);
        System.out.println(res);
    }

    public int lengthOfLastWord(String s) {
            for (int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)==' '){
                    continue;
                }
                int j=i-1;
                //要j》=0 因为i是index 是比长度少一个1  所以j=0时也要向左挪一个1 这样i-j 就把 i少的那一个1补回来了
                while (j>=0 &&s.charAt(j)!=' '){
                    j--;
                }
                return i-j;
            }
            return 0;
    }
}
