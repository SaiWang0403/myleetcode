import org.junit.Test;
//1304
public class FindNUniqueIntegersSumuptoZero {
    @Test
    public void test(){
        int[] res=sumZero(4);
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] sumZero(int n) {
        int[] answer = new int[n];
        for (int i = 1; i<n; i+=2) {
            answer[i-1]=i;
            answer[i]=-i;
        }
        return answer;
    }
}
