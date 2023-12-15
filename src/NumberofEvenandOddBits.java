import org.junit.Test;
//2595
public class NumberofEvenandOddBits {
    @Test
    public void test(){
        int n=2;
        int[] res=evenOddBit(n);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] evenOddBit(int n) {
        String str1 = Integer.toBinaryString(n);
        StringBuffer sc = new StringBuffer(str1);
        sc.reverse();
        String str =sc.toString();

        int Even_count = 0;
        int Odd_count = 0;
        int[] arr = new int[2];

        for(int i=0 ; i<str.length();i++){
            if((str.charAt(i) == '1') && i%2==0){
                Even_count++;
            }
            else if(str.charAt(i) == '1'){
                Odd_count++;
            }
        }

        arr[0] = Even_count;
        arr[1] = Odd_count;

        return arr;
    }
}
