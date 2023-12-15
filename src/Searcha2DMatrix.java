import org.junit.Test;

public class Searcha2DMatrix {
    //74

    @Test
    public void test(){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res=searchMatrix(matrix,3);
        System.out.println(res);
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=m*n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(target<=matrix[mid/n][mid%n]){
                r=mid;
            }
            else{
                //需要mid+1 而不是mid 比如 只有1， 3  target是3 这时候l=0 r=1 mid=0  target大于中间数 应该l=mid+1 变成1 如果l=mid l就不会变还是0 则永远出不去循环
                l=mid+1;
            }
        }
        return matrix[r/n][r%n]==target;
    }
}
