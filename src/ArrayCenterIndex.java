import org.junit.Test;

import java.util.Arrays;

public class ArrayCenterIndex {

    @Test
    public void test(){
        int[] arr={1,7,3,6,5,6};
        //1 7 3 6
        // 6 5 6
        int res=arrayCenterIndex(arr);
        System.out.println(res);
    }

    public int arrayCenterIndex(int[] arr){
        int sum= Arrays.stream(arr).sum();
        int total=0;
        for (int i=0;i<arr.length;i++){
            total+=arr[i];
            if(total ==sum){
                return i;
            }
            sum=sum-arr[i];
        }
        return -1;
    }
}
