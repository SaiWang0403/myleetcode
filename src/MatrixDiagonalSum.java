import org.junit.Test;
//1572
public class MatrixDiagonalSum {
    @Test
    public void test(){
        int[][] mat={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int res=diagonalSum(mat);
        System.out.println(res);
    }

    public int diagonalSum(int[][] mat) {
        int i=0,j=mat.length-1,s=0;
        while(i<mat.length){
            if(i!=j)
                s+=(mat[i][i]+mat[i][j]);
            else
                s+=mat[i][j];
            i++;j--;
        }
        return s;
    }

}
