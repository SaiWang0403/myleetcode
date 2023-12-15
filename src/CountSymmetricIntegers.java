import org.junit.Test;
//2843
public class CountSymmetricIntegers {
    @Test
    public void test(){
        int low=1200;
        int high=1230;
        int res=countSymmetricIntegers(low,high);
        System.out.println(res);
    }

    public int countSymmetricIntegers(int low, int high) {
        int res=0;
        for(int i=low;i<=high;i++){
            String s=i+"";
            if(s.length()%2!=0){
                continue;
            }
            int temp=0;
            int len=s.length();
            for(int j=0;j<len/2;j++){
                temp+=s.charAt(j)-s.charAt(len-j-1);
            }
            if(temp==0){
                res++;
            }
        }
        return res;
    }
}
