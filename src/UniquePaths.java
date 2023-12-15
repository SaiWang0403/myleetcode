import org.junit.Test;

public class UniquePaths {
    //62

    @Test
    public void test(){
        int m=3;
        int n=7;
        int res=uniquePaths(m,n);
        System.out.println(res);
    }

    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 &&j==0){
                    dp[i][j]=1;
                }
                else{
                    if(i>0){
                        dp[i][j]+=dp[i-1][j];
                    }
                    if(j>0){
                        dp[i][j]+=dp[i][j-1];
                    }
                }

            }
        }
        return dp[m-1][n-1];
    }
}
