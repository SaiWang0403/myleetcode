import org.junit.Test;
//563
public class BinaryTreeTilt {
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1,new TreeNode(2),new TreeNode(3));
        int res=findTilt(treeNode);
        System.out.println(res);
    }

    public int findTilt(TreeNode root) {

        if (root == null)
            return 0;

        return  java.lang.Math.abs(sum(root.right) - sum(root.left)) + findTilt(root.left) + findTilt(root.right);
    }

    private int sum(TreeNode node){

        if (node == null)
            return 0;

        return node.val + sum(node.left) + sum(node.right);
    }
}
