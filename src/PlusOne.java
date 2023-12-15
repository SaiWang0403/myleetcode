import org.junit.Test;

import java.util.Arrays;

public class PlusOne {

    @Test
    public void test(){
        int[] arr={9,1};
        int[] res=plusOne(arr);
        System.out.println(Arrays.toString(arr));

    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}
