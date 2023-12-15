import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IncreasingSubsequences {

    @Test
    public void test(){
        int[] arr={4,6,7,7,1,8};
        List<List<Integer>> res=findSubsequences(arr);
        System.out.println(res);

    }

    HashSet<List<Integer>> res= new HashSet<List<Integer>>();
    ArrayList<Integer> list =new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
            if(nums.length <2){
                return new ArrayList<List<Integer>>();
            }
            backtrack(nums,0);
            return new ArrayList<List<Integer>>(res);
    }

    public void backtrack(int[] nums, int start){
        if(list.size() >=2){
            res.add( new ArrayList<Integer>( list));
        }
        for (int i=start;i<nums.length;i++){
            //比如 4 6 第一个7 和4 6 第二个7
            if(i>start && nums[i]==nums[i-1]){
                //这里不能break 结束整个for循环 因为没有sort过 必须每个都比较 比如 4 6 7 7 1 8 过掉1但是你还需要8 例如 4 7 7 8 所以只能continue 过掉当前循环
                continue;
            }
            //前一个数如果大于后一个数 那么结束当前循环 换下一个
            if(list.size() >0 && list.get(list.size()-1) >nums[i]){
                continue;
            }

            list.add(nums[i]);
            backtrack(nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
