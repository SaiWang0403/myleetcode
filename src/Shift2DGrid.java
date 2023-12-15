import org.junit.Test;
//1260
import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    @Test
    public void test(){
        int[][] grid={{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> res=shiftGrid(grid,2);
        System.out.println(res);
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<List<Integer>> result = new ArrayList<>(m);
        ArrayList<Integer> al = new ArrayList<>();
        for (int[] row : grid)
            for (int element : row)
                al.add(element);

        //ROTATING THE LAST ELEMENTS
        while (k-- > 0) {
            al.add(0, al.remove(al.size() - 1));
        }

        int index = 0;
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(al.get(index++));
            }
            result.add(temp);
        }
        return result;
    }
}
