import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//40
public class CombinationSum2 {
    @Test
    public void test(){
        int[] arr={1,1,2,5};
        List<List<Integer>> res= combinationSum2(arr,8);
        System.out.println(res);
    }

    public List<List<Integer>> combinationSum2(int[] a, int t) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        dfs(0, a, t, new ArrayList<>(), res);
        return res;
    }

    void dfs(int u, int[] a, int t, List<Integer> list, List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = u; i < a.length; i++) {
            if (i > u && a[i] == a[i - 1]){
                //要continue 因为就算第一个的所有结果都算完了 第二个和第一个一样， 那也要继续从第三个开始算 因为可能从第三个开始还有结果
                continue;
            }
            if (a[i] > t) {
                return;
            }
            list.add(a[i]);
            dfs(i + 1, a, t - a[i], list, res);
            list.remove(list.size() - 1);
        }
    }
}
