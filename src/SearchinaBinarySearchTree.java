import org.junit.Test;
//700
public class SearchinaBinarySearchTree {

    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        TreeNode res=searchBST(treeNode,2);
        System.out.println(res.val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }

        TreeNode next = null;
        if (root.val > val) {
            if (root.left != null)
                next = searchBST(root.left, val);
        } else {
            if (root.right !=null)
                next = searchBST(root.right, val);
        }

        return next;
    }
}
