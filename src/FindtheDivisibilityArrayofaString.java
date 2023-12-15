import org.junit.Test;
//2575
public class FindtheDivisibilityArrayofaString {
    @Test
    public void test(){
        String s="4868438856666666";
        int m=6;
        int[] res=divisibilityArray(s,m);
        for (int n:res){
            System.out.println(n);
        }
    }
    public int[] divisibilityArray(String word, int m) {
        int sum=0;
        int[] arr=new int[word.length()];
        for(int i=0;i<word.length();i++){
            int temp=word.charAt(i)-'0';
            sum=(sum*10+temp)%m;
            if(sum%m==0){
                arr[i]=1;
            }
        }
        return arr;
    }
}
