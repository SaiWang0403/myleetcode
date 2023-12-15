import org.junit.Test;
//7
public class ReverseInterger {
    @Test
    public void test(){
        int x=-123;

        System.out.println(reverse(x));

    }

  public int reverse(int x){
        String xstr = x+"";
        String fs="";
        if(xstr.substring(0,1).equals("-")){
            fs="-";
            xstr=xstr.substring(1);

        }
        String res="";
        for(int i=xstr.length()-1;i>=0;i--){
            res+=xstr.charAt(i);
        }

        try {
            return Integer.parseInt(fs+res);
        }catch(Exception e) {
            return 0;
        }


    }

}
