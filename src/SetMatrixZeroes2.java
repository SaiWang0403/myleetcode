import org.junit.Test;
//73
import java.util.Arrays;

public class SetMatrixZeroes2 {

    @Test
    public void test() {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public void setZeroes(int[][] g) {
        //开始时先判断第一行和第一列里有没有0， 记录下来
        //再判断别的地方有没有0， 如果有 就把这个0在第一行和第一列的最头的那个数标记成0
        //再判断第一行和第一列最头那个数被没被标记成0，如果是第一行有个数是0 就把它在的整列都变成0 （如果第一列有0 那就把这个0在的整行全变成0） 这么做后只能把除了第一行和第一列之外的所有0 所在的行和列 都变成0  比如说第一行第三个数有个0， 现在只能把第三列都变成0，不能把第一行变成0
        //所以第一步是必要的， 最后一步就是 如果第一行或第一列有0 就把第一行或第一列都变成0
        int m = g.length, n = g[0].length;
        boolean row1 = false, col1 = false;
        for (int i = 0; i < m; i++) {
            if (g[i][0] == 0) {
                col1 = true;
            }
        }

        for (int j = 0; j < n; j++) {
            if (g[0][j] == 0) {
                row1 = true;
            }
        }
        //后三个for循环都是i=1开始 因为只需要遍历右下角的数有没有0， 因为第一行和第一列已经考虑过了
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (g[i][j] == 0) {
                    //这个式子只能判断除了第一行和第一列之外的数是0 的时候 把这个0所在的第一行和第一列（最左面和最上面）的数变成0， 比如说2,1（第2行第一列）有个0 就把2,0 和0,1 上的数变成0
                    //如果在第一行或第一列上不行 比如 0,2（第一行第2列） 就会把 0 0 和0 2 上的数变成0
                    g[i][0] = g[0][j] = 0;
                }
            }

        }


        for (int i = 1; i < m; i++) {
            if (g[i][0] == 0) {
                Arrays.fill(g[i], 0);
            }
        }

        for (int j =1; j < n; j++) {
            if (g[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    g[i][j] = 0;
                }
            }
        }
        if (row1) Arrays.fill(g[0], 0);
        if (col1) for (int i = 0; i < m; i++) g[i][0] = 0;
    }
}