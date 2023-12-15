import org.junit.Test;
//897
public class IncreasingOrderSearchTree {
    @Test
    public void test(){
        TreeNode treeNode =new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode res=increasingBST(treeNode);
        System.out.println(res);
    }

    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
    }
}
