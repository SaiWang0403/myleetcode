import org.junit.Test;

import java.util.Arrays;
//59
public class SpiralMatrix2 {

    @Test
    public void test(){
        int n=3;
        int[][] res=generateMatrix(n);
        System.out.println(Arrays.deepToString(res));
    }

    public int[][] generateMatrix(int n) {
            int[][] res=new int[n][n];
            int count=1;
            int[] dx={0,1,0,-1};
            int[] dy={1,0,-1,0};
            int x=0;
            int y=0;

            while (count<=n*n){
                for (int k=0;k<4;k++){
                    while (0<=x && x<n &&0<=y &&y<n &&res[x][y]==0){
                        res[x][y]=count;
                        count++;
                        x+=dx[k];
                        y+=dy[k];
                    }
                    x-=dx[k];
                    y-=dy[k];
                    x+=dx[(k+1)%4];
                    y+=dy[(k+1)%4];
                }
            }
            return res;
    }
}
