import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//后序 左右中 中的时候输出他自己
public class BinayTreePostOrderTravesal {

    @Test
    public void test(){
//        TreeNode treeNode=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(postorderTraversal2(treeNode));
    }



    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        accessTree(root,res);
        return res;

    }

    public void accessTree(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        accessTree(root.left,res);
        accessTree(root.right,res);
        res.add(root.val);

    }
}
