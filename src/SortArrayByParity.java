import org.junit.Test;

public class SortArrayByParity {
    @Test
    public void test(){
        int[] nums={3,1,2,4};
        int[] res=sortArrayByParity(nums);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] sortArrayByParity(int[] A) {
        int[] sorted = new int[A.length];
        int e = 0;
        int o = A.length - 1;
        for(int i: A) {
            if (i % 2 == 0) {
                sorted[e++] = i;
            } else {
                sorted[o--] = i;
            }
        }
        return sorted;
    }
}
