//104


import org.junit.Test;

public class MaximunDepthOfBinaryTree {

    @Test
    public void test(){
//        TreeNode treeNode=new TreeNode(1,new TreeNode(2),new TreeNode(3));
//        TreeNode treeNode=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6,new TreeNode(7),null),null));
        System.out.println(maxDepth(treeNode));


    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else {
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
