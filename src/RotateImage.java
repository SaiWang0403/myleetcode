import org.junit.Test;

public class RotateImage {
//48
    @Test
    public void test(){
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int row=0;row<3;row++){
            for (int col=0 ; col<3;col++){
                System.out.println(matrix[row][col]);
            }
        }
    }

// 矩阵是n * n 意味着长和高 相等 都是n

    public void rotate(int[][] matrix) {
            int n=matrix.length;
            //先按对角线 从左上到右下 反转
            for (int i=0;i<n;i++){
                for (int j=0;j<i;j++){
                    swap(matrix,i,j,j,i);
                }
            }

            //第二次 按中间 左右反转
            for (int i=0;i<n;i++){
                for (int j=0; j<n/2;j++){
                    swap(matrix,i,j,i,n-j-1);
                }
            }
    }

    public void swap(int[][] matrix,int i1,int j1,int i2,int j2){
        int temp=matrix[i1][j1];
        matrix[i1][j1]=matrix[i2][j2];
        matrix[i2][j2]=temp;

    }

}
