import org.junit.Test;
//922
public class SortArrayByParityII {
    @Test
    public void test(){
        int[] A ={4,2,5,7};
        int[] res=sortArrayByParityII(A);
        for (int i:res){
            System.out.println(i);
        }
    }

    public int[] sortArrayByParityII(int[] A)
    {
        int i = 0;
        int j = 1;

        while(i < A.length && j < A.length)
        {
            //找个偶数位上的奇数
            while(i < A.length && A[i] % 2 == 0) {
                i += 2;
            }
            //找个奇数位上的偶数
            while(j < A.length && A[j] % 2 == 1) {
                j += 2;
            }

            if(i < A.length && j < A.length)
                swap(A, i, j);
        }
        return A;
    }

    private void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
