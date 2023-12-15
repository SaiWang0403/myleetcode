import org.junit.Test;

import java.util.Arrays;
//归并排序
public class MergeSort  {

    @Test
    public void test() throws Exception {
        int[] arr={8,9,1,7,2,3,5,4,6,0};
        int[] res=sort(arr);

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
    public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        if(sourceArray.length<2){
            return sourceArray;
        }
        int mid=sourceArray.length/2;
        //>=0  < index mid  8 9 1 7 2
        int[] left=Arrays.copyOfRange(sourceArray,0,mid);
        int[] right=Arrays.copyOfRange(sourceArray,mid,sourceArray.length);
        return merge(sort(left),sort(right));


    }

    protected int[] merge(int[] left, int[] right) {
       int i=0;
       int[] res=new int[left.length+right.length];
       while (left.length>0 && right.length>0){
           if(left[0]<right[0]){
               res[i++]=left[0];
               //把left的array 里 这时候的letf【0】 给去掉
               left=Arrays.copyOfRange(left,1,left.length);
           }
           else {
               res[i++]=right[0];
               right=Arrays.copyOfRange(right,1,right.length);
           }

       }
       while (left.length>0){
           res[i++]=left[0];
           left=Arrays.copyOfRange(left,1,left.length);
       }
       while (right.length>0){
           res[i++]=right[0];
           right=Arrays.copyOfRange(right,1,right.length);
       }
       return res;

    }

}