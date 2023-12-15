import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Permutation {
//46 全排列  同时 看Subsets 78 和 CombinationSum 39
    @Test
    public void test(){
        int[] nums={1,2,3};
        List<List<Integer>> res= permute(nums);
        System.out.println(res);
    }

    List<List<Integer>> res=new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
            backtrack(nums,new LinkedList<>());
            return res;
    }
//不需要index 因为需要找到的可以直接通过遍历 遍历出来
    public void backtrack(int[] nums, LinkedList<Integer> path){
        
        if(path.size()==nums.length){
            res.add(new LinkedList<>(path));
            //不加return也行 但会多判断一遍情况  最好加return 因为这是结束点 不用再干别的了
            return;

        }
        //要i=0 这里没有index 因为直接遍历完就行 i会遍历因为有个continue 所以不会遍历重复的点
        for (int i=0;i<nums.length;i++){
            if(path.contains(nums[i])){
                continue;
            }
            path.addLast(nums[i]);
            backtrack(nums,path);
            path.removeLast();
        }
    }
}
