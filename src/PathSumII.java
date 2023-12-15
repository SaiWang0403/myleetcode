import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(5,new TreeNode(4),new TreeNode(4));
        List<List<Integer>> res=pathSum(treeNode,9);
        System.out.println(res);
    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res =new ArrayList<>();
        dfs(res,targetSum,root,new ArrayList<>());
        return res;
    }

    public void dfs(List<List<Integer>> res,int targetSum,TreeNode root,List<Integer> list){
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
                list.add(root.val);
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
        }
        if(root.left!=null){
            list.add(root.val);
            dfs(res,targetSum-root.val,root.left,list);
            list.remove(list.size()-1);
        }

        if(root.right!=null){
            list.add(root.val);
            dfs(res,targetSum-root.val,root.right,list);
            list.remove(list.size()-1);
        }

    }
}
