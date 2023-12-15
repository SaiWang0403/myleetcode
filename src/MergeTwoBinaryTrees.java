import org.junit.Test;
//617
public class MergeTwoBinaryTrees {
    @Test
    public void test(){
        TreeNode t1=new TreeNode(1,new TreeNode(2),null);
        TreeNode t2=new TreeNode(2,new TreeNode(4),new TreeNode(3));
        System.out.println(mergeTrees(t1,t2));
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode mergedNode = null;
        if (t1 != null && t2 != null) {
            mergedNode = new TreeNode(t1.val + t2.val);
        }
        else if (t1 != null) {
            mergedNode = t1;
        }
        else if (t2 != null) {
            mergedNode = t2;
        }
        mergedNode.left = mergeTrees(t1.left, t2.left);
        mergedNode.right = mergeTrees(t1.right, t2.right);
        return mergedNode;
    }
}
