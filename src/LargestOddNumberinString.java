import org.junit.Test;
//1903
public class LargestOddNumberinString {
    @Test
    public void test(){
        String num="35472";
        String res=largestOddNumber(num);
        System.out.println(res);
    }

    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            System.out.println(num.charAt(i)+1);
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
