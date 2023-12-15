import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//144 前序 中左右
public class BinayTreePreOrderTraversal {


    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(preorderTraversal(treeNode));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> res= new ArrayList<>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                res.add(root.val);
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            root=root.right;
        }
        return res;
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
        res.add(root.val);
        accessTree(root.left,res);
        accessTree(root.right,res);


    }
}
