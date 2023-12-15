import org.junit.Test;

import java.util.Arrays;

public class HeapSort  {

    @Test
    public void test() throws Exception {
        int[] arr={4,6,3,5,9};
        int[] res=sort(arr);

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }

  public int[] sort(int[] arr){
        int[] res=Arrays.copyOf(arr,arr.length);
        int len=res.length;
        buildMaxHeap(res,len);
        for (int i=len-1;i>0;i--){
            swap(res,0,i);
            len--;
            buildMaxHeap(res,len);
        }
        return res;
  }

    public void buildMaxHeap(int[] res,int len){
        for (int i=len/2-1;i>=0;i--){
            heapify(res,i,len);
        }
    }
    public void heapify(int[] res,int i,int len){
        int left=2*i+1;
        int right=2*i+2;
        int larget=i;

        if(left<len&& res[left]>res[larget]){
            larget=left;
        }
        if(right<len && res[right]>res[larget]){
            larget=right;
        }
        if(larget!=i){
            swap(res,i,larget);
            heapify(res,i,larget);
        }
    }

    public void swap(int[] res, int i,int j){
        int temp=res[i];
        res[i]=res[j];
        res[j]=temp;
    }

}