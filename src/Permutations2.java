import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//47
public class Permutations2 {
    @Test
    public void test(){
        int[] nums={1,1,2};
        List<List<Integer>> res= permuteUnique(nums);
        System.out.println(res);
    }



    public List<List<Integer>> permuteUnique(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[a.length];
        dfs(new ArrayList<>(), used, a, res);
        return res;
    }

    void dfs(List<Integer> list, boolean[] used, int[] a, List<List<Integer>> res) {
        if (list.size() == a.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (used[i]) {
                continue;
            }
            //去重 想只留下来 相同元素升序的情况 1——1  1——2  2  不要 1——2  1——1 2
            //要保证 两个数相等的时候 而且 前面那个数还没用过的情况不要
            //i > 0  && a[i] == a[i - 1] 表示经历过这个数 又遇到了个相同的数  如果之前经历的这个数还在现在的list里 那么没关系 这个数还可以用 接着加
            //如果经历的这个数不在现在的list里 因为第一次在上面已经加过了 如果这个数不在现在这list里 说明这不是第一次了 （因为第一次的话肯定在现在list里 而且已经加过了）那么continue
            if (i > 0 && !used[i - 1] && a[i] == a[i - 1]){
                continue;
            }
            used[i] = true;
            list.add(a[i]);
            dfs(list, used, a, res);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
