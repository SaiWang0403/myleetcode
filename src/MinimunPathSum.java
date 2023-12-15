import org.junit.Test;

import java.util.Arrays;

public class MinimunPathSum {
    //64

    @Test
    public void test(){
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        int res=minPathSum(grid);
        System.out.println(res);
    }

    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length <1 || grid[0].length <1){
            return 0;
        }
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for (int i=0; i<m;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for (int i=0;i<m;i++){
            for (int j=0; j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                if(i!=0){
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+grid[i][j]);
                }
                if(j!=0){
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+grid[i][j]);
                }
            }
        }
        return dp[m-1][n-1];
    }
}
