import org.junit.Test;
//938
public class RangeSumofBST {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(10,new TreeNode(5,new TreeNode(3),new TreeNode(7)),new TreeNode(15,null,new TreeNode(18)));
        int res=rangeSumBST(treeNode,7,15);
        System.out.println(res);

    }

    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) {
            return 0;
        }
        if(low <= root.val && root.val <= high) {
            sum += root.val;
        }
        if(root.val > low) {
            rangeSumBST(root.left, low, high);
        }
        if(root.val < high) {
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}
