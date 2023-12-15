import org.junit.Test;
//832
public class FlippinganImage {
    @Test
    public void test(){
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        int[][] res=flipAndInvertImage(image);
        for(int i=0;i< res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }


    }

    public int[][] flipAndInvertImage(int[][] A) {
        int [][] B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++){
            int len = A[i].length;
            for (int j = 0; j < len; j++){
                B[i][j] = A[i][len - 1 - j] == 0 ? 1 : 0;
            }
        }
        return B;
    }
}
