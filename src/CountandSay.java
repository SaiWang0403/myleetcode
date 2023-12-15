import org.junit.Test;

public class CountandSay {
    //38

    @Test
    public void test(){
        int n=4;
        String res=countAndSay(n);
        System.out.println(res);
    }


    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s=countAndSay(n-1);
        String res="";
        for(int i=0,j=0;i<s.length();i++){
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            res+=j-i+""+s.charAt(i);
            i=j-1;
        }

        return res;
    }
}

