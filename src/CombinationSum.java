import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//39 组合总和  dfs 回溯 剪枝  //46 全排列  同时 看Subsets 78 和 CombinationSum 39
public class CombinationSum {

    @Test
    public void test(){
        int[] arr={2,3,6,7};
        List<List<Integer>> res= combinationSum(arr,7);
        System.out.println(res);
    }
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<Integer>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //这种做法剪枝需要排序 因为要确保后面的数比前面的大 这样前面的这个数如果不合格（大于target） 那么后面的数肯定也不合格 就不用考虑之后的情况了
        Arrays.sort(candidates);
        helper(candidates,0,target);
        return res;
    }
    ////这里要有start 参数 因为这个题需要记录一下这个点 递归的时候下次就从这个点 开始 就不用从0开始
    //像是 3 之后就只用看3 6 7 而不再看2了 就排除掉 3 2 2 的情况  如果不从start这个点开始 而是从0 开始 那么 3 2 2 也会出现  2 3 2也会
    //需要 start index 因为这道题需要找到需要的 几个数 不能像46题通过遍历直接都遍历出来
    public void helper(int[] candidates, int start, int target){
        if(target==0){
            res.add(new ArrayList<Integer>(list));
            //也可以不加return 不加的话就多判断一遍 也会对 最好加return 因为这是结束点 不用再干别的了
            return;
        }

        for (int i=start; i<candidates.length;i++){
            //剪枝 如果candidates[i] 比如2 大于之前传进来的target 1 那么就终止掉这次递归 可以直接break 因为sort过 前一个不行后一个肯定也不行
            if(candidates[i] > target){
                break;
            }

            list.add(candidates[i]);
            //把剩下的值变成target 比如7-2 5成为新的target
            //要传i 而不是i+1 因为 i这个数可以重复 比如2 2 3 （2 后不用直接往后看3  还可以看2自己）
            helper(candidates,i,target-candidates[i]);
            //回溯
            //return 回来的还接着for循环
            //break 就这个for循环结束 后面的都不看了 回到上一个for循环  接着上一个for循环循环
            list.remove(list.size()-1);
        }
    }
}
