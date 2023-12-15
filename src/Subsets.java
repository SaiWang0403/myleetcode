import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
//78 子集 //46 全排列  同时 看Subsets 78 和 CombinationSum 39
public class Subsets {

    @Test
    public void test(){
        int[] nums={1,2,3};
        List<List<Integer>> res =subsets(nums);
        System.out.println(res);
    }

    List<List<Integer>> res= new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new LinkedList<>());
        return res;
    }
//这里要有index 参数 因为这个题需要记录一下这个点 递归的时候下次就从这个点+1 开始 就不用从0开始 如果从0 那么一直递归0 就出不去了
    //需要index 因为这道题需要找到需要的 几个数 不能像46题通过遍历直接都遍历出来
    public void backtrack(int[] nums, int index, LinkedList<Integer> path){
        //这里没有if 因为没有结束点  正常都遍历完 就是结束
        res.add(new LinkedList<>(path));
        //要i=index 因为下次遍历就是往下看 而不用从头看  1 以后就看 2 而不用再看1
        for (int i=index; i<nums.length;i++){
            path.add(nums[i]);
            backtrack(nums,i+1,path);
            path.removeLast();
        }
    }

}
