import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
//90
    @Test
    public void test(){
        int[] nums={1,2,2};
        List<List<Integer>> res=subsetsWithDup2(nums);
        System.out.println(res);

    }


      public List<List<Integer>> subsetsWithDup2(int[] a) {
         Arrays.sort(a);
         List<List<Integer>> res = new ArrayList<>();
         boolean[] used = new boolean[a.length];
         dfs(0, new ArrayList<>(), used, a, res);
         return res;
     }

     void dfs(int u, List<Integer> list, boolean[] used, int[] a, List<List<Integer>> res) {
         res.add(new ArrayList<>(list));
         for (int i = u; i < a.length; i++) {
             if (i > u && a[i] == a[i - 1] && !used[i - 1]) {
                 continue;
             }
             list.add(a[i]);
             used[i] = true;
             dfs(i + 1, list, used, a, res);
             list.remove(list.size() - 1);
             used[i] = false;
         }
     }
}
