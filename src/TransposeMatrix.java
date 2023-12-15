import org.junit.Test;
//867
public class TransposeMatrix {
    @Test
    public void test(){
        int[][] matrix={{1,2,3},{4,5,6}};
        int[][] res=transpose(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }

    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int arr[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {

                arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}
