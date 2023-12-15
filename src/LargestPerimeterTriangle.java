import org.junit.Test;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    @Test
    public void test(){
        int[] arr={3,6,2,3};
        int res=largestPerimeterTriangle(arr);
        System.out.println(res);

    }

    //sort后 从最后开始取 倒数第一 倒数第二 倒数第三的数 这三个数必定是现在最大的三个数 如果倒数第三 + 倒数第二 》 倒数第一 那就满足成立三角形的条件
    //如果不成立 就再往前取
    public int largestPerimeterTriangle(int[] arr){
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=2;i--){
            if(arr[i-2]+arr[i-1]>arr[i]){
                return arr[i]+arr[i-1]+arr[i-2];
            }
        }
        return 0;
    }
}
