import org.junit.Test;

public class Searcha2DMatrix2 {
    //240

    @Test
    public void test(){
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean res=searchMatrix(matrix,13);
        System.out.println(res);
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            int num = matrix[i][j];

            if (num == target)
                return true;
            else if (num > target)
                j--;
            else
                i++;
        }

        return false;
    }
}
