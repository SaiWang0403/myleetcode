import org.junit.Test;

import java.util.*;
//94 中序 左中右
public class InOrderTraversal {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(inorderTraversal(treeNode));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();

        Stack<TreeNode> stack=new Stack<>();
        while (root !=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            res.add(root.val);
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

        accessTree(root.left,res);
        res.add(root.val);
        accessTree(root.right,res);


    }
}
