import org.junit.Test;

import java.util.Arrays;

public class ArrangePositiveNegativeNumber {
    @Test
    public void test(){
        int[] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  void arrange(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }

        int i = 0, j = a.length - 1;
        while (i <= j) {
            while (i <= j && a[i] < 0) i++;
            while (i <= j && a[j] >= 0) j--;
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            i++;
            j--;
        }
    }


}
