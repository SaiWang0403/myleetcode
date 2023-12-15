import org.junit.Test;
//基数排序
import java.util.Arrays;

public class RadixSort  {
    @Test
    public void test() throws Exception {
        //找到 最大数的位数 也就是最大位数
        //先按个位数字放相应的index的桶里， 再提出来到arr里，就变成
        // 13 3 23 4 14 24 55 5
        // 再按十位数字放放桶， 这样每个桶里都是个位数小的那个数先放进去， 比如 1的桶里就是 13 ，14
        //再提出来到arr 十位数就也排好了
        int[] arr={13,55,4,14,3,24,23,5,222};
        int[] res=sort(arr);

        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }

   public int[] sort(int[] sourcearr){
        int[] arr=Arrays.copyOf(sourcearr,sourcearr.length);
        int maxvalue=getmax(arr);
        int maxValueLength =maxvaluelength(maxvalue);
        int[] res=redixsort(maxValueLength,arr);
        return res;
   }

   public int getmax(int[] arr){
        int max=arr[0];
        for (int value : arr){
            if(max<value){
                max=value;
            }
        }
        return max;
   }
   public int maxvaluelength(int maxvalue){
        if(maxvalue==0){
            return 1;
        }
        int len=0;
        for (int i=maxvalue; i!=0; i/=10){
            len++;
        }
        return len;
   }

   public int[] redixsort(int maxvaluelength,int[] arr){
        int mod=10;
        int dev=1;
        for (int i=0;i<maxvaluelength;i++,dev*=10,mod*=10){
            int[][] counter=new int[10][0];
            for (int j=0;j<arr.length;j++){
                int bucket=(arr[j] %mod)/dev;
                counter[bucket]=arrApend(counter[bucket],arr[j]);
            }
            int pos=0;
            for (int[] bucket :counter){
                for (int value : bucket){
                    arr[pos++]=value;
                }
            }
        }
        return arr;
   }

   public int[] arrApend(int[] arr,int value){
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=value;
        return arr;
   }
}