import org.junit.Test;

import java.util.Stack;
//872
public class LeafSimilarTrees {
    @Test
    public void test(){
        TreeNode root1=new TreeNode(3,new TreeNode(5,new TreeNode(6),new TreeNode(2,new TreeNode(7),new TreeNode(4))),new TreeNode(1,new TreeNode(9),new TreeNode(8)));

        TreeNode root2=new TreeNode(3,new TreeNode(5,new TreeNode(6),new TreeNode(7)),new TreeNode(1,new TreeNode(4),new TreeNode(2,new TreeNode(9),new TreeNode(8))));
        boolean res=leafSimilar(root1,root2);
        System.out.println(res);
    }



    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root1); s2.push(root2);
        while(!s1.empty() && !s2.empty()){
            if(dfs(s1) != dfs(s2))
                return false;
        }
        return s1.empty() && s2.empty();
    }

    private int dfs(Stack<TreeNode> s){
        while(true){
            TreeNode node = s.pop();
            if(node.right != null)
                s.push(node.right);
            if(node.left != null)
                s.push(node.left);
            if(node.right == null && node.left == null)
                return node.val;
        }
    }
}
