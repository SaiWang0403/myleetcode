import org.junit.Test;
//1299
public class ReplaceElementswithGreatestElementonRightSide {
    @Test
    public void test(){
        int[] arr={17,18,5,4,6,1};
        int[] res=replaceElements(arr);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] replaceElements(int[] arr) {
        int max = -1; // All elements in the input range are positive. Otherwise, it can be modified slightly

        for (int i = arr.length - 1; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}
