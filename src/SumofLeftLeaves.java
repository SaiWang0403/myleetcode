import org.junit.Test;
//404
public class SumofLeftLeaves {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(3,new TreeNode(9,new TreeNode(1),new TreeNode(2)),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        int res=sumOfLeftLeaves(treeNode);
        System.out.println(res);
    }


    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}
