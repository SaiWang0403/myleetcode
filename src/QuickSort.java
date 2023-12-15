import org.junit.Test;

import java.util.Arrays;

public class QuickSort {


    @Test
    public void test() throws Exception {
        int[] arr={4,6,3};
        //最左边的是基数， 4是基数， 的index 是pivot  index=pivot+1=1 i=index 也是1
        //如果 i的那个点的数比基数大 i接着往后退 index 不变 别的不变
        //若果 i的那个点比基数小 i在的那个数 与 index在的那个数 位置互换 之后 index++ 就保证了 index之前的数 （除了第一个基数外）所有数都比基数小
        // 436 这时候index在6上 i超过6 退出循环
        //退出循环后 把基数（也就是pivot 上的点） 与 index-1 的数 互换
        //346
        int[] res=sort(arr);

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
//    public int[] sort(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//         quickSort(arr,start,end);
//         return arr;
//    }
//    public static void quickSort(int[] nums, int start, int end){
//        if(start>end) return;
//        int i,j,base;
//        i=start;
//        j=end;
//        base=nums[start];
//        while (i<j){
//            while (i<j && nums[j]>=base) j--;
//            while (i<j && nums[i]<=base) i++;
//
//            if(i<j){
//                swap(nums,i,j);
//            }
//        }
//        swap(nums,start,i);
//        quickSort(nums,start,j-1);
//        quickSort(nums,j+1,end);
//    }
//    public static void swap(int[] nums,int left,int right){
//        int temp=nums[left];
//        nums[left]=nums[right];
//        nums[right]=temp;
//    }

    public int[] sort (int[] sourcearr){
        int[] arr= Arrays.copyOf(sourcearr,sourcearr.length);
        return  quicksort(arr,0,arr.length-1);

    }

    public int[] quicksort(int[] arr,int left,int right){
        //可以是left <=right， 但下面的也行也少算几次 所以快
        //没有必要判断left=right的情况 比如left 和right 都是0，直接返回就好，不用接着求left 是0 right也是0 的partition的值，因为不会变
        //求partition的值的过程 就是把最左边的数放到中间， 让这个数（也就是中间）的位置成为partition ，而且这个数左边的数都比他小 右边的>=他
        //partition是分割的意思
        if(left <right){
            int parttionIndex=partition(arr,left,right);
            quicksort(arr,left,parttionIndex-1);
            quicksort(arr,parttionIndex+1,right);
        }
        return arr;
    }

    public int partition(int[] arr,int left, int right){
        int pivot=left;
        int index=pivot+1;
        for (int i=index;i<=right;i++){
            if(arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
