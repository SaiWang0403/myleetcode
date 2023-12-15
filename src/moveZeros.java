import org.junit.Test;

import java.util.Arrays;

//283
public class moveZeros {
    @Test
    public void test(){
        int[] arr={1,0,2,3};
        movezeros(arr);

        System.out.println(Arrays.toString(arr));

    }

    public void movezeros(int[] arr){
        if(arr==null){
            return;
        }

        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        for (int i=j;i<arr.length;i++){
            arr[i]=0;
        }
    }
}
