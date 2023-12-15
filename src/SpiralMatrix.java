import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
//54
public class SpiralMatrix {

    @Test
    public void test(){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res=spiralOrder(matrix);
        System.out.println(res);
    }

    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> res = new ArrayList<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int m = a.length, n = a[0].length;
        int x = 0, y = 0;
        while (res.size() < m * n) {
            //每次向右下左上 check一圈后才能check res.size() < m * n)
            //加上5 后会多check一圈 再跳出while循环 不过没关系

            for (int k = 0; k < 4; k++) {
                //如果在界内而且 这个点以前没走过 那么直接res加上 然后标记这个点走过了 然后x和y 按下载方向往后走一步
                while (0 <= x && x < m && 0 <= y && y < n && a[x][y] != 101) {
                    res.add(a[x][y]);
                    a[x][y] = 101;
                    x += dx[k];
                    y += dy[k];
                }
                //如果出界了 或者碰到之前标记过的点了 那就说明现在在的这个点不能走 那就往后退一步 然后还要朝着下个方向往前走一步 这样就到了对的点
                x -= dx[k];
                y -= dy[k];
                x += dx[(k + 1) % 4];
                y += dy[(k + 1) % 4];
            }
        }

        return res;
    }
}
