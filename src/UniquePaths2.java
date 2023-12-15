import org.junit.Test;
//63
public class UniquePaths2 {

    @Test
    public void test(){
        int[][] o={{0,1},{0,0}};
        int res=uniquePathsWithObstacles(o);
        System.out.println(res);
    }



    public int uniquePathsWithObstacles(int[][] o) {
        int m=o.length;
        int n=o[0].length;

        int[][] arr=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                if(o[i][j]==1){
                    continue;
                }
                if(i==0 &&j==0){
                    arr[i][j]=1;
                }
                else{
                    if(i>0){
                        arr[i][j]+=arr[i-1][j];
                    }
                    if(j>0){
                        arr[i][j]+=arr[i][j-1];
                    }
                }
            }
        }
        return arr[m-1][n-1];
    }
}
