import org.junit.Test;
//2278
public class PercentageofLetterinString {
    @Test
    public void test(){
        String s="foobar";
        char letter='o';
        int res=percentageLetter(s,letter);
        System.out.println(res);
    }

    public int percentageLetter(String s, char letter) {
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        return (100*count)/len;
    }
}
